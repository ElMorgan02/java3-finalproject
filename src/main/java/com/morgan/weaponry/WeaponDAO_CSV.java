package com.morgan.weaponry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WeaponDAO_CSV {
    public static List<Weapon> getAll(HttpServletRequest request, HttpServletResponse response) {
        List<Weapon> weaponry = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(request.getServletContext().getRealPath("WEB-INF/weaponry/weaponry.csv")))) {
            int rowCount = 0;
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(",");
                rowCount++;
                if (rowCount != 1) {
                    String name = line[0];
                    String Tier = line[4];
                    String Element = line[8];
                    int Power = Integer.parseInt(line[9]);
                    String Season = line[17];
                    int SeasonAsInt = 0;
                    if(!(Season.equals("") || Season == null)){
                        SeasonAsInt = Integer.parseInt(Season);
                    }

                    boolean Crafted = Boolean.parseBoolean(line[41]);
                    int Kill_Tracker = Integer.parseInt(line[43]);
                    weaponry.add(new Weapon(name, Tier, Element, Power, SeasonAsInt, Crafted, Kill_Tracker));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return weaponry;
    }
}
