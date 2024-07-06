package com.ligabetplay.model.player;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PlayerCreationDAOImpl implements IPlayerCreationDAO{
    // attribute connection
    private Connection connection;

    // constructor that initialize the connection
    public PlayerCreationDAOImpl(Connection connection) {
        this.connection = connection;
    }

    // method to create a player and save it into database
    @Override
    public void createPlayer(Player player) throws SQLException {
        String sql = "INSERT INTO player (name, lastName, age, position, nationality, shirtNumber) VALUES (?,?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, player.getName());
        statement.setString(2, player.getLastName());
        statement.setInt(3, player.getAge());
        statement.setInt(4, player.getPosition());
        statement.setString(5, player.getNationality());
        statement.setInt(6, player.getShirtNumber());
        statement.executeUpdate();
    }
    
}
