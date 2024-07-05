package com.ligabetplay.model.player;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ligabetplay.model.user.User;

public class PlayerRetrievalDAOImpl implements IPlayerRetrievalDAO{
    // attributes
    private Connection connection;

    // constructor to initialize the connection to database
    public PlayerRetrievalDAOImpl(Connection connection) {
        this.connection = connection;
    }

    // TODO: Finish get all players
    // method to get all the players
    @Override
    public List<Player> getAllPlayers() throws SQLException {
        List<Player> players = new ArrayList<>();
        String sql = "SELECT id, name, lastName, role FROM user";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            Player player = new Player();
            
        }
        return players;
    }
}
