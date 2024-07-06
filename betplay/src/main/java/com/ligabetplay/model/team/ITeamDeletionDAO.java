package com.ligabetplay.model.team;

import java.sql.SQLException;

public interface ITeamDeletionDAO {
    void deleteTeam(Team team) throws SQLException;
}
