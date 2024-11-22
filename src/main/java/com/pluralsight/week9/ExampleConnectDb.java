package com.pluralsight.week9;

import java.sql.*;

public class ExampleConnectDb {
    public static void main(String[] args) throws SQLException {
        // get the connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "root");

        // create statement
        String query = "SELECT first_name, address_id FROM customer WHERE first_name = ?";
        PreparedStatement statement = connection.prepareStatement(query);

        // set params
        String name = "TIM";
        statement.setString(1, name);

        // execute query
        ResultSet rs = statement.executeQuery();

        // process results
        while(rs.next()) {
            System.out.println(rs.getString(1) + " : " + rs.getInt(2));
        }

        connection.close();
    }
}
