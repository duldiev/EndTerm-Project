package com.company;

import java.sql.*;

public class SQLExecution {

    public static void executeQuery(String query) {
        String connectionURL = "jdbc:postgresql://localhost:5432/postgres";
        Connection con = null;
        ResultSet rs = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");

            con = DriverManager.getConnection(connectionURL, "postgres", "king");

            stmt = con.createStatement();

            rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getString("surname"));
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                rs.close();
                stmt.close();
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
