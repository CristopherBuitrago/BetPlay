package com.ligabetplay.model.player;

import java.sql.SQLException;

public interface IPlayerDeletionDAO {
    void deletePlayer(Player player) throws SQLException;
}
