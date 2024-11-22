package com.pluralsight.week9;

import java.io.IOException;
import java.sql.*;

public class DatabaseConnectionExceptionsTryWithResources {
    public static void main(String[] args) {

        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "root");
            PreparedStatement statement = connection.prepareStatement("SELECT city FROM cityy");
            ResultSet rs = statement.executeQuery()
        ) {
            // process results
            while (rs.next()) {
                System.out.println(rs.getString("city"));
            }

        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
