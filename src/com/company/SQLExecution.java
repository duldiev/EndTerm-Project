package com.company;

import java.sql.*;
import java.util.Random;

public class SQLExecution {

    public static void executeQuery(String query, char table, boolean isSelect) {
        String connectionURL = "jdbc:postgresql://localhost:5432/postgres";  // link to database
        Connection con = null;
        ResultSet rs = null;  // retrieved data from database
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");  // driver of postgresql to connect with Java
            con = DriverManager.getConnection(connectionURL, "postgres", "king");  // accessing the database
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);  // retrieving data with query
            if (isSelect) {  // if true, then it prints data out
                boolean isEmpty = true;
                while (rs.next()) {  // accessing the each data from table
                    isEmpty = false;
                    switch (table) {
                        case 'c' -> {  // prints all the data from crib table
                            System.out.println("Crib #" + rs.getInt("id") + ":\nOwner - " +
                                    rs.getString("owner_fname") + " " + rs.getString("owner_lname") + "\nAddress - " +
                                    rs.getString("address") + "\nWalls: " + rs.getBoolean("walls") + "; Doors: " +
                                    rs.getBoolean("doors") + "; Windows: " + rs.getBoolean("windows") + "; Roof: " +
                                    rs.getBoolean("roof") + "; Garage: " + rs.getBoolean("garage") + "; Fence: " +
                                    rs.getBoolean("fence") + "; Pool: " + rs.getBoolean("pool") + ";\nMade by ozbek: " +
                                    rs.getInt("ozbek_id") + "; Managed by headmaster: " + rs.getInt("headmaster_id") + "\n");
                        }
                        case 'h' -> {  // prints all the data from head master table
                            System.out.println("Head Master #" + rs.getInt("id") + ":\nFull name - " +
                                    rs.getString("fname") + " " + rs.getString("lname") + "\nGender - " +
                                    rs.getString("gender") + "\nAge - " + rs.getInt("age") + "\n");
                        }
                        case 'o' -> {  // prints all the data from ozbek table
                            System.out.println("Ozbek #" + rs.getInt("id") + ":\nFull name - " +
                                    rs.getString("fname") + " " + rs.getString("lname") + "\nGender - " +
                                    rs.getString("gender") + "\nAge - " + rs.getInt("age") + "\nMastery: " +
                                    rs.getInt("masteryYear") + "\n");
                        }
                        case 'p' -> {
                            System.out.println("Client #" + rs.getInt("id") + ":\nFull name - " +
                                    rs.getString("fname") + " " + rs.getString("lname"));
                        }
                    }
                }
                if (isEmpty) {
                    System.out.println("Table is empty");
                }
            }
        } catch (Exception e) {
            System.out.println(e);  // if error, then it prints what's wrong
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static int nextCribId(String table) {  // to get maximum id in crib table
        String connectionURL = "jdbc:postgresql://localhost:5432/postgres";  // link to database
        Connection con = null;
        ResultSet rs = null;;  // retrieved data from database
        Statement stmt = null;
        int max_id = (table.equals("crib") ? 300 : 400); // max id with initial value x. If there is no data in table, then next id is x + 1
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(connectionURL, "postgres", "king");
            stmt = con.createStatement();
            rs = stmt.executeQuery("select MAX(" + table + ".id) from " + table + ";");  // retrieving maximum id of cribs from table
            while (rs.next()) {
                max_id = rs.getInt("max");  // getting the maximum id by its parameter "max"
            }
        } catch (Exception e) {
            System.out.println(e);  // if error, then it prints what's wrong
        }
        return max_id + 1;  // returning retrieved maximum id
    }
}