package com.ligabetplay.model.player;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PlayerDeletionDAOImpl implements IPlayerDeletionDAO{
    // attributes
    private Connection connection;

    // constructor to initialize the connection to database
    public PlayerDeletionDAOImpl(Connection connection) {
        this.connection = connection;
    }

    // method to 
    @Override
    public void deletePlayer(Player player) throws SQLException {
        String sql = "DELETE FROM player WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, player.getId());
        statement.executeUpdate();
    }

}
