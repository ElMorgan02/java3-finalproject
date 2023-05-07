package com.morgan.login;

import com.morgan.data_access.UserDAO_MySQL;
import org.mindrot.jbcrypt.BCrypt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TO DO if a user is already logged in, redirect them to the home page.
        request.setAttribute("loginFailed", false);
        request.getRequestDispatcher("WEB-INF/login_stuff/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        if(email.equals("") || password.equals("") || email == null || password == null) {
            System.out.println("email or password missing");
            request.setAttribute("loginFailed", true);
            request.getRequestDispatcher("WEB-INF/login_stuff/login.jsp").forward(request, response);
            return;
        }

        UserDAO_MySQL userDAO = new UserDAO_MySQL();
        User user = userDAO.getUser(email);
        System.out.println(user.getFavorites());
        if(user == null) {
            System.out.println("email not found");
            request.setAttribute("loginFailed", true);
            request.getRequestDispatcher("WEB-INF/login_stuff/login.jsp").forward(request, response);
            return;
        } else {
            if (!BCrypt.checkpw(password, String.valueOf(user.getPassword()))) {
                System.out.println("Email found, password incorrect");
                request.setAttribute("loginFailed", true);
                request.getRequestDispatcher("WEB-INF/login_stuff/login.jsp").forward(request, response);
                return;
            } else {
                // CORRECT MATCH!
                HttpSession session = request.getSession();
                request.changeSessionId();
                System.out.println(session.getId());
                user.unsetPassword();
                session.setAttribute("user", user);
                response.sendRedirect(request.getContextPath()); // redirect to homepage
            }
        }
    }
}
