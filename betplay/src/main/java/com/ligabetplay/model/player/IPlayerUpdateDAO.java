package com.ligabetplay.model.player;

import java.sql.SQLException;

public interface IPlayerUpdateDAO {
    void updatePlayer(Player player) throws SQLException;
}
