package com.ligabetplay.model.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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

    //loggin method
    public boolean loggin(User user) throws SQLException {
        String sql = "SELECT username FROM user WHERE email = ? AND password = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, user.getEmail());
        statement.setString(2, user.getPassword());
        ResultSet rs = statement.executeQuery();
    
        // verification of the user
        if (rs.next()) {
            return true;
        } else {
            return false;
        }
    }

    // Get all users
    public List<User> getAllUsers() throws SQLException {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setEmail(rs.getString("email"));
            user.setPassword(rs.getString("password"));
            user.setRole(rs.getInt("role"));
            users.add(user);
        }
        return users;
    }

    // update username
    public void updateUsername(User user) throws SQLException {
        String sql = "UPDATE user SET username = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, user.getUsername());
        statement.setInt(2, user.getId());
        statement.executeUpdate();
    }

    // update email
    public void updateEmail(User user) throws SQLException {
        String sql = "UPDATE user SET email = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, user.getEmail());
        statement.setInt(2, user.getId());
        statement.executeUpdate();
    }

    // update password
    public void updatePassword(User user) throws SQLException {
        String sql = "UPDATE user SET password = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, user.getPassword());
        statement.setInt(2, user.getId());
        statement.executeUpdate();
    }

    // update role
    public void updateRole(User user) throws SQLException {
        String sql = "UPDATE user SET role = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, user.getRole());
        statement.setInt(2, user.getId());
        statement.executeUpdate();
    }

    // update user in general
    public void updateUser(User user) throws SQLException {
        String sql = "UPDATE user SET username = ?, email = ?, password = ?, role = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, user.getUsername());
        statement.setString(2, user.getEmail());
        statement.setString(3, user.getPassword());
        statement.setInt(4, user.getRole());
        statement.executeUpdate();
    }

    // delete an user
    public void deleteUser(User user) throws SQLException{
        String sql = "DELETE FROM user WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, user.getId());
        statement.executeUpdate();
    }
}