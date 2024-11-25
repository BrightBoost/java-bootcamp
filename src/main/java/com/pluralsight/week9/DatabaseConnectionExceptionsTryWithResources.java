package com.pluralsight.week9;

import java.io.IOException;
import java.sql.*;

public class DatabaseConnectionExceptionsTryWithResources {
    public static void main(String[] args) {

        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", args[0], args[1]);
            PreparedStatement statement = connection.prepareStatement("SELECT city FROM city WHERE city = ?");

        ) {
            statement.setString(1, "Abu Dhabi");
            try(ResultSet rs = statement.executeQuery()) {
                while (rs.next()) {
                    // make it throw exception, handled by catch of the outer block
                    System.out.println(rs.getString("cityyy"));
                }
            }

        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
