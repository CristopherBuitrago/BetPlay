package com.ligabetplay.model.player;

import java.sql.SQLException;
import java.util.List;

public interface IPlayerRetrievalDAO {
    List<Player> getAllPlayers() throws SQLException;
}
