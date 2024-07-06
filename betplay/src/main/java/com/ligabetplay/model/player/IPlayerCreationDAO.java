package com.ligabetplay.model.player;

import java.sql.SQLException;

public interface IPlayerCreationDAO {
    void createPlayer(Player player) throws SQLException;
}
