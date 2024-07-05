package com.ligabetplay.model.user;

import java.sql.SQLException;

public interface IUserAuthenticationDAO {
    boolean login(User user) throws SQLException;
}