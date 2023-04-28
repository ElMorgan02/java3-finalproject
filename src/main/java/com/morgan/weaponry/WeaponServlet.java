package com.morgan.weaponry;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "WeaponServlet", value = "/weaponry")
public class WeaponServlet extends HttpServlet {
    private static List<Weapon> weaponry;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(weaponry == null) {
            weaponry = WeaponDAO_CSV.getAll(request, response);
        }

        request.getRequestDispatcher("WEB-INF/weaponry/weaponry.jsp").forward(request, response);
    }
}
