package com.ligabetplay.model.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserAuthenticationDAOImpl implements IUserAuthenticationDAO{

    private final Connection connection;

    public UserAuthenticationDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean login(User user) throws SQLException {
        // declare query
        String sql = "SELECT id FROM users WHERE email = ? AND password = ?";
        // declare the statement
        PreparedStatement statement = connection.prepareStatement(sql);
        // set parametters
        statement.setString(1, user.getEmail());
        statement.setString(2, user.getPassword());
        // make a list of the data get into database
        ResultSet rs = statement.executeQuery();
        // return the boolean value
        return rs.next();
    }
    
}