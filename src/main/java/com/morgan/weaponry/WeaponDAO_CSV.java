package com.morgan.weaponry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Arrays;
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
                    long Id = Long.parseLong(line[2].replace("\"", ""));
                    String Tier = line[4];
                    String Type = line[5];
                    String Element = line[8];
                    int Power = Integer.parseInt(line[9]);
                    String Season = line[17];
                    int SeasonAsInt = 0;
                    if(!(Season == null || Season.equals(""))){
                        SeasonAsInt = Integer.parseInt(Season);
                    }

                    boolean Crafted = Boolean.parseBoolean(line[41]);
                    int Kill_Tracker = Integer.parseInt(line[43]);
                    weaponry.add(new Weapon(name, Id, Tier, Type, Element, Power, SeasonAsInt, Crafted, Kill_Tracker));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return weaponry;
    }
}
