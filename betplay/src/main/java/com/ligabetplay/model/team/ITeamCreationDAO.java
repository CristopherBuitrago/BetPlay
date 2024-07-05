package com.ligabetplay.model.team;

import java.sql.SQLException;

public interface ITeamCreationDAO {
    void createTeam(Team team) throws SQLException;
}
