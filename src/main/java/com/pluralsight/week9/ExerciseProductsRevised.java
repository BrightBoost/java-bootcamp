package com.pluralsight.week9;

import java.sql.*;
import java.util.Scanner;

public class ExerciseProductsRevised {
    public static void main(String[] args) throws SQLException {
        // get the connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "root");
        displayAllProducts(connection);
        displaySingleProductById(connection);
        connection.close();
    }

    public static void displayAllProducts(Connection connection) throws SQLException {
        // create statement
        String query = "SELECT productName, productId FROM products";
        PreparedStatement statement = connection.prepareStatement(query);

        // execute query

        ResultSet rs = statement.executeQuery();

        // process results
        while(rs.next()) {
            System.out.println(rs.getString("productName") + " - " + rs.getInt("productId"));
        }
    }

    public static void displaySingleProductById(Connection connection) throws SQLException {
        System.out.println("The product with which ID would you like? Enter the ID please.");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        scanner.close();

        // create statement
        String query = "SELECT productName, productId FROM products WHERE productId = ?";
        PreparedStatement statement = connection.prepareStatement(query);

        // execute query
        statement.setInt(1, id);
        ResultSet rs = statement.executeQuery();

        // process results
        while(rs.next()) {
            System.out.println(rs.getString("productName") + " - " + rs.getInt("productId"));
        }
    }
}
