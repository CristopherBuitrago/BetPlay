package com.ligabetplay.model.user;

import java.sql.SQLException;

public interface IUserUpdateDAO {
    void updateUsername(User user) throws SQLException;
    void updateEmail(User user) throws SQLException;
    void updatePassword(User user) throws SQLException;
    void updateRole(User user) throws SQLException;
    void updateUser(User user) throws SQLException;
}
