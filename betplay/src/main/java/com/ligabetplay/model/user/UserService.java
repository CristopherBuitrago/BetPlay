package com.ligabetplay.model.user;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

public class UserService {
    
    private IUserRegistrationDAO userRegistrationDAO;
    private IUserAuthenticationDAO userAuthenticationDAO;
    private IUserRetrievalDAO userRetrievalDAO;
    private IUserUpdateDAO userUpdateDAO;
    private IUserDeletionDAO userDeletionDAO;

    public UserService() {
        try {
            Properties props = new Properties();
            props.load(getClass().getClassLoader().getResourceAsStream("db.properties"));
            String url = props.getProperty("url");
            String user = props.getProperty("user");
            String password = props.getProperty("password");
            Connection connection = DriverManager.getConnection(url, user, password);

            this.userRegistrationDAO = new UserRegistrationDAOImpl(connection);
            this.userAuthenticationDAO = new UserAuthenticationDAOImpl(connection);
            this.userRetrievalDAO = new UserRetrievalDAOImpl(connection);
            this.userUpdateDAO = new UserUpdateDAOImpl(connection);
            this.userDeletionDAO = new UserDeletionDAOImpl(connection);
        } catch (IOException | SQLException e) {
        }
    }

    // Métodos de servicio que delegan en las DAOs

    public void registerUser(User user) throws SQLException {
        userRegistrationDAO.register(user);
    }

    public boolean loginUser(User user) throws SQLException {
        return userAuthenticationDAO.login(user);
    }

    public List<User> getAllUsers() throws SQLException {
        return userRetrievalDAO.getAllUsers();
    }

    public void updateUserUsername(User user) throws SQLException {
        userUpdateDAO.updateUsername(user);
    }

    public void updateUserEmail(User user) throws SQLException {
        userUpdateDAO.updateEmail(user);
    }

    public void updateUserPassword(User user) throws SQLException {
        userUpdateDAO.updatePassword(user);
    }

    public void updateUserRole(User user) throws SQLException {
        userUpdateDAO.updateRole(user);
    }

    public void updateUser(User user) throws SQLException {
        userUpdateDAO.updateUser(user);
    }

    public void deleteUser(User user) throws SQLException {
        userDeletionDAO.deleteUser(user);
    }
}
