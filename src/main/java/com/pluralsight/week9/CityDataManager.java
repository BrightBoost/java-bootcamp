package com.pluralsight.week9;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CityDataManager {
    private DataSource dataSource;

    public CityDataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    // get all cities
    public List<City> getAllCities() {
        List<City> cities = new ArrayList<>();

        // fetch cities from db
        try(Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM city");
            ResultSet rs = statement.executeQuery()
        ) {
            while(rs.next()) {
                cities.add(new City(rs.getInt(1), rs.getString(2)));
            }
        } catch(SQLException e) {
            System.out.println( e.getMessage());
        }

        return cities;
    }

    // get city by name

    // get city by id
}
