package com.pluralsight.week9.shipperExercise;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ShipperDao {

    private DataSource dataSource;

    public ShipperDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Shipper> findAll() {
        List<Shipper> shippers = new ArrayList<>();
        try(Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM shippers");
            ResultSet rs = statement.executeQuery()
        ) {
            while(rs.next()) {
                Shipper shipper = new Shipper(rs.getInt(1), rs.getString(2), rs.getString(3));
                shippers.add(shipper);
            }

        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return shippers;
    }
    public int save(Shipper shipper) {
        int newId = -1;
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into shippers (companyName, phone) values(?, ?)", Statement.RETURN_GENERATED_KEYS)
        ) {
            preparedStatement.setString(1, shipper.getCompanyName());
            preparedStatement.setString(2, shipper.getPhone());
            preparedStatement.executeUpdate();
            try(ResultSet keysRs = preparedStatement.getGeneratedKeys()) {
                while(keysRs.next()) {
                    newId = (int) keysRs.getLong(1);
                }
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return newId;
    }
}
