package com.pluralsight.week9;

import java.sql.*;
import java.util.Scanner;

public class NorthwindTraders {

    private static Scanner scanner = new Scanner(System.in);
    private static Connection connection;
    public static void main(String[] args) {
        init(args);
        int menuChoice = menu();
        switch(menuChoice) {
            case 1:
                displayAllProducts();
                break;
            case 2:
                displayAllCustomers();
                break;
            case 3:
                chooseProductsByCategory();
                break;
            case 0:
                System.out.println("BYE");
                System.exit(0);
                break;
        }
    }

    public static void init(String[] args) {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", args[0], args[1]);
        } catch(SQLException sqlException) {
            System.out.println("Oh no: " + sqlException.getMessage());
        }
    }

    public static int menu() {
        String content = """
                What do you want to do?
                  1) Display all products
                  2) Display all customers
                  3) See products by category 
                  0) Exit
                Select an option:""";
        System.out.println(content);
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    public static void displayAllProducts() {
        try(
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM products");
            ResultSet rs = statement.executeQuery()
        ) {
            while(rs.next()) {
                System.out.println("Product id: " + rs.getString("productId"));
                System.out.println("Name:       " + rs.getString("productName"));
                System.out.println("Price:      " + rs.getString("unitPrice"));
                System.out.println("Stock:      " + rs.getString("unitsInStock"));
                System.out.println("--------------------");
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void displayAllCustomers() {
        try(
                PreparedStatement statement = connection.prepareStatement("SELECT * FROM customers");
                ResultSet rs = statement.executeQuery()
        ) {
            while(rs.next()) {
                System.out.println("Customer name: " + rs.getString("contactName"));
                System.out.println("Name:       " + rs.getString("contactTitle"));
                System.out.println("--------------------");
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void chooseProductsByCategory() {
        // display all the categories
        displayAllCategories();

        // get the category choice
        System.out.println("Which category id would you like to see the products for?");
        int categoryChoice = scanner.nextInt();
        scanner.nextLine();

        // display the products for that category
        displayProductsByCategory(categoryChoice);
    }

    public static void displayAllCategories() {
        try(
                PreparedStatement statement = connection.prepareStatement("SELECT * FROM categories");
                ResultSet rs = statement.executeQuery()
        ) {
            while(rs.next()) {
                System.out.println("Category name: " + rs.getString("categoryName"));
                System.out.println("Category id: " + rs.getString("categoryId"));
                System.out.println("--------------------");
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void displayProductsByCategory(int categoryId) {
        try(
                PreparedStatement statement = connection.prepareStatement("SELECT p.categoryId, productId, productName, unitPrice, UnitsInStock, categoryName " +
                        "FROM products p " +
                        "JOIN categories c " +
                        "ON p.categoryId = c.categoryId " +
                        "WHERE p.categoryId = " + categoryId);
                ResultSet rs = statement.executeQuery()
        ) {
            while(rs.next()) {
                System.out.println("Category name: " + rs.getString("categoryName"));
                System.out.println("Product id: " + rs.getString("productId"));
                System.out.println("Name:       " + rs.getString("productName"));
                System.out.println("Price:      " + rs.getString("unitPrice"));
                System.out.println("Stock:      " + rs.getString("unitsInStock"));
                System.out.println("--------------------");
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
