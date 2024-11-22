package com.pluralsight.week9;

import java.sql.*;

public class ExerciseProducts {
    public static void main(String[] args) throws SQLException {
        // get the connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "root");

        // create statement
        Statement statement = connection.createStatement();

        // execute query
        String query = "SELECT productName FROM products";
        ResultSet rs = statement.executeQuery(query);

        // process results
        while(rs.next()) {
            System.out.println(rs.getString("productName"));
        }

        connection.close();
    }
}
