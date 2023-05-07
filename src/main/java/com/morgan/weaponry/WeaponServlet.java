package com.morgan.weaponry;

import com.morgan.data_access.UserDAO_MySQL;
import com.morgan.login.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "WeaponServlet", value = "/weaponry")
public class WeaponServlet extends HttpServlet {
    private static List<Weapon> weaponry;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(weaponry == null) {
            weaponry = WeaponDAO_CSV.getAll(request, response);
        }

        String sort = request.getParameter("sort");
        if(sort == null) {
            sort = "";
        }
        switch(sort) {
            case "alphaAsc":
                weaponry.sort((weapon1, weapon2) -> weapon1.getName().compareTo(weapon2.getName()));
                break;
            case "alphaDesc":
                weaponry.sort((weapon1, weapon2) -> weapon1.getName().compareTo(weapon2.getName()) * -1);
                break;
            case "powerAsc":
                weaponry.sort((weapon1, weapon2) -> weapon1.getPower() - weapon2.getPower());
                break;
            case "powerDesc":
                weaponry.sort((weapon1, weapon2) -> weapon2.getPower() - weapon1.getPower());
                break;
        }

        String show = request.getParameter("show");
        if(show == null) {
            show = "all";
        }
        if(show.equalsIgnoreCase("all")) {
            request.setAttribute("weaponry", weaponry);
        } else {
            //https://stackoverflow.com/questions/715650/how-to-clone-arraylist-and-also-clone-its-contents
            List<Weapon> filteredWeaponry = new ArrayList<Weapon>(weaponry.size());
            for (Weapon weapon : weaponry) {
                try {
                    filteredWeaponry.add((Weapon)weapon.clone());
                } catch (CloneNotSupportedException e) {
                    throw new RuntimeException(e);
                }
            }
            String finalShow = show;
            filteredWeaponry.removeIf(weapon -> !weapon.getTier().replaceAll(" ", "").equalsIgnoreCase(finalShow));
            request.setAttribute("weaponry", filteredWeaponry);
        }

        request.getRequestDispatcher("WEB-INF/weaponry/weaponry.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(weaponry == null) {
            weaponry = WeaponDAO_CSV.getAll(request, response);
        }

        if (request.getParameter("toggleFavorite") != null) {
            Long selectedWeapon = Long.parseLong(request.getParameter("toggleFavorite"));
            User currentUser = (User) request.getSession().getAttribute("user");
            UserDAO_MySQL DAO = new UserDAO_MySQL();
            if (currentUser != null) {
                if (currentUser.getFavorites().contains(selectedWeapon)) {
                    DAO.unfavorite(currentUser, selectedWeapon);
                }
                else {
                    DAO.favorite(currentUser, selectedWeapon);
                }
            }
            request.getSession().setAttribute("user", currentUser);
        }
        request.setAttribute("weaponry", weaponry);
        request.getRequestDispatcher("WEB-INF/weaponry/weaponry.jsp").forward(request, response);
    }
}
