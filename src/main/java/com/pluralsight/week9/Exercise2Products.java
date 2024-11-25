package com.pluralsight.week9;

import java.sql.*;
import java.util.*;

public class Exercise2Products {
    public static void main(String[] args) throws SQLException {
        // get the connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", args[0], args[1]);
        displayAllProducts(connection);
        connection.close();

    }

    public static void displayAllProducts(Connection connection) throws SQLException {
        // create statement
        String query = "SELECT productName, productId, unitPrice, unitsInStock FROM products";
        PreparedStatement statement = connection.prepareStatement(query);

        // execute query

        ResultSet rs = statement.executeQuery();

        // process results
        while(rs.next()) {
            System.out.println("Product id: " + rs.getString("productId"));
            System.out.println("Name:       " + rs.getString("productName"));
            System.out.println("Price:      " + rs.getString("unitPrice"));
            System.out.println("Stock:      " + rs.getString("unitsInStock"));
            System.out.println("--------------------");
        }
    }


}
