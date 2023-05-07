package com.morgan.login;

import com.morgan.data_access.UserDAO_MySQL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ViewUsersServlet", value = "/view-users")
public class ViewUsersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Add this in any servlet where you want the user to login first
        HttpSession session = request.getSession();
        System.out.println(session.getId());
        if(session.getAttribute("user") == null) {
            response.sendRedirect("login");
            return;
        }

        User user = (User)session.getAttribute("user");
        if(!user.getPrivileges().equals("admin")) {
            // Do whatever you want to users without privileges
            response.sendRedirect(request.getContextPath());
            return;
        }

        UserDAO_MySQL user_data = new UserDAO_MySQL();
        request.setAttribute("users", user_data.getAllUsers());
        request.getRequestDispatcher("WEB-INF/login_stuff/view-users.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}