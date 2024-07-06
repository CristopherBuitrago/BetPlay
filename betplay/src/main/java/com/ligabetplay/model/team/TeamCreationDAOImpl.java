package com.ligabetplay.model.team;

import java.sql.Connection;
import java.sql.SQLException;

public class TeamCreationDAOImpl {
    private final Connection connection;

    public TeamCreationDAOImpl(Connection connection) {
        this.connection = connection;
    }
}
