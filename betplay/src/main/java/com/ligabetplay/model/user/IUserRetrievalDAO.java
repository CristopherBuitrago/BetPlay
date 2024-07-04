package com.ligabetplay.model.user;

import java.sql.SQLException;
import java.util.List;

public interface IUserRetrievalDAO {
    List<User> getAllUsers() throws SQLException;
}
