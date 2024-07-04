package com.ligabetplay.model.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDeletionDAOImpl implements IUserDeletionDAO{

    private Connection connection;

    public UserDeletionDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void deleteUser(User user) throws SQLException {
        String sql = "DELETE FROM users WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, user.getId());
        statement.executeUpdate();
    }

}
