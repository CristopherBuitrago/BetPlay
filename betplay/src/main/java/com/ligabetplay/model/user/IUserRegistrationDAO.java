package com.ligabetplay.model.user;

import java.sql.SQLException;

public interface IUserRegistrationDAO {
    void register(User user) throws SQLException;
}
