package com.ligabetplay.model.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class UserDAO {

    private Connection connection;

    //constructor
    public UserDAO() {
        try {
            Properties props = new Properties();
            props.load(getClass().getClassLoader().getResourceAsStream("db.properties"));
            String url = props.getProperty("url");
            String user = props.getProperty("user");
            String password = props.getProperty("password");
            connection = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //register method
    public void register(User user) throws SQLException {
        String sql = "INSERT INTO users (username, email, password, role) VALUES (?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, user.getUsername());
        statement.setString(2, user.getEmail());
        statement.setString(3, user.getPassword());
        statement.setInt(4, user.getRole());
        statement.executeUpdate();
    }

    

}
