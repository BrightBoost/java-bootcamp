package com.pluralsight.week9;

import java.io.IOException;
import java.sql.*;

public class DatabaseConnectionExceptions {

    // see revised version in DatabaseConnectionExceptionsTryWithResources
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            // get the connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "root");

            // create statement
            String query = "SELECT city FROM city";
            statement = connection.prepareStatement(query);

            // execute query
             rs = statement.executeQuery();

            // process results
            while (rs.next()) {
                System.out.println(rs.getString("city"));
            }

        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
