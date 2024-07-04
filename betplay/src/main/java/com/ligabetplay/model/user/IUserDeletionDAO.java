package com.ligabetplay.model.user;

import java.sql.SQLException;

public interface IUserDeletionDAO {
    void deleteUser(User user) throws SQLException;
}
