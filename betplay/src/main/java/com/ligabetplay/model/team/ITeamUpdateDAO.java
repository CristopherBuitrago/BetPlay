package com.ligabetplay.model.team;

import java.sql.SQLException;

public interface ITeamUpdateDAO {
    void updateName(Team team) throws SQLException;
    void updateCity(Team team) throws SQLException;
    void updateStadium(Team team) throws SQLException;
    void updateTrainer(Team team) throws SQLException;
    void updateTeam(Team team) throws SQLException;
}
