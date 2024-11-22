package com.pluralsight.week9;

import com.pluralsight.week7.streams.Person;

import javax.sql.DataSource;
import java.sql.*;

public class DatabaseConnecting {
    public static void main(String[] args) throws SQLException {
        // get the connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "root");

        // create statement
        Statement statement = connection.createStatement();

        // execute query
        String query = "SELECT city FROM city";
        ResultSet rs = statement.executeQuery(query);

        // process results
        while(rs.next()) {
            System.out.println(rs.getString("city"));
        }

        connection.close();
    }
}
