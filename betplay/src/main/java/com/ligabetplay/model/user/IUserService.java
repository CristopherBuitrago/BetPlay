package com.ligabetplay.model.user;

import java.sql.SQLException;
import java.util.List;

public interface IUserService {
    void registerUser(User user) throws SQLException;
    boolean loginUser(User user) throws SQLException;
    void deleteUser(User user) throws SQLException;
    List<User> getAllUsers() throws SQLException;
    void updateUserUsername(User user) throws SQLException;
    void updateUserEmail(User user) throws SQLException;
    void updateUserPassword(User user) throws SQLException;
    void updateUserRole(User user) throws SQLException;
    void updateUser(User user) throws SQLException;
}
