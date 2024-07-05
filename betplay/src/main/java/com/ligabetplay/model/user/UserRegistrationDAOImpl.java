package com.ligabetplay.model.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRegistrationDAOImpl implements IUserRegistrationDAO{
    private final Connection connection;

    public UserRegistrationDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void register(User user) throws SQLException {
        String sql = "INSERT INTO user (username, email, password, role) VALUES (?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, user.getUsername());
        statement.setString(2, user.getEmail());
        statement.setString(3, user.getPassword());
        statement.setInt(4, user.getRole());
        statement.executeUpdate();
    }
}
