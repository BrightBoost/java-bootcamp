package com.pluralsight.week9;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;

public class Main {
    public static void main(String[] args) {
        BasicDataSource bds = new BasicDataSource();
        bds.setUrl("jdbc:mysql://localhost:3306/sakila");
        bds.setUsername(args[0]);
        bds.setPassword(args[1]);

        CityDataManager cityDataManager = new CityDataManager(bds);

        System.out.println(cityDataManager.getAllCities());
    }
}
