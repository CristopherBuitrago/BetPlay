package com.ligabetplay.model.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserUpdateDAOImpl implements IUserUpdateDAO{
    private final Connection connection;

    public UserUpdateDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void updateUsername(User user) throws SQLException {
        String sql = "UPDATE user SET username = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, user.getUsername());
        statement.setInt(2, user.getId());
        statement.executeUpdate();
    }

    @Override
    public void updateEmail(User user) throws SQLException {
        String sql = "UPDATE user SET email = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, user.getEmail());
        statement.setInt(2, user.getId());
        statement.executeUpdate();
    }

    @Override
    public void updatePassword(User user) throws SQLException {
        String sql = "UPDATE user SET password = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, user.getPassword());
        statement.setInt(2, user.getId());
        statement.executeUpdate();
    }

    @Override
    public void updateRole(User user) throws SQLException {
        String sql = "UPDATE user SET role = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, user.getRole());
        statement.setInt(2, user.getId());
        statement.executeUpdate();
    }

    @Override
    public void updateUser(User user) throws SQLException {
        String sql = "UPDATE user SET username = ?, email = ?, password = ?, role = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, user.getUsername());
        statement.setString(2, user.getEmail());
        statement.setString(3, user.getPassword());
        statement.setInt(4, user.getRole());
        statement.setInt(5, user.getId());
        statement.executeUpdate();
    }
}
