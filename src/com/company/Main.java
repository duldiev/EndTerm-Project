package com.company;

import java.sql.*;

public class Main {

    public int id_builder = 101;
    public int id_director = 201;
    public int id_house = 301;

    public static void main(String[] args) {
        HouseBuilder builder1 = new HouseBuilder(101, "Sanzhar", "Ergesh", "male", 26);
        Director boss = new Director(builder1, builder1.getId(), 201,"Erzhan", "Bekzhanov", "male", 32);
        boss.makeStandard();
        House newCrib = builder1.getProduct();

        while (true) {
            System.out.println("1. Build new house.");
            System.out.println("2. Houses.");
            System.out.println("3. Directors.");
            System.out.println("4. Builder.");
        }
    }

}
