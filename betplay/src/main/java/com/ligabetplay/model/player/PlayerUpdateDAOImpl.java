package com.ligabetplay.model.player;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PlayerUpdateDAOImpl implements IPlayerUpdateDAO{
    // attributes
    private Connection connection;

    // constructor to initialize the connection to database
    public PlayerUpdateDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void updatePlayer(Player player) throws SQLException {
        String sql = "UPDATE FROM player SET name = ?, lastName = ?, age = ?, position = ?, nationality = ?, shirtNumber = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, player.getName());
        statement.setString(2, player.getLastName());
        statement.setInt(3, player.getAge());
        statement.setInt(4, player.getPosition());
        statement.setString(5, player.getNationality());
        statement.setInt(6, player.getShirtNumber());
        statement.setInt(7, player.getId());
        statement.executeUpdate();
    }

    
}
