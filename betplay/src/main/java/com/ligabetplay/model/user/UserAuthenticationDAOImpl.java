package com.ligabetplay.model.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserAuthenticationDAOImpl implements IUserAuthenticationDAO{

    private Connection connection;

    public UserAuthenticationDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean login(User user) throws SQLException {
        String sql = "SELECT username FROM users WHERE email = ? AND password = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, user.getEmail());
        statement.setString(2, user.getPassword());
        ResultSet rs = statement.executeQuery();

        return rs.next();
    }
    
}