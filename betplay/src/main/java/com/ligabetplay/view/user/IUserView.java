package com.ligabetplay.view.user;

import java.util.List;

import com.ligabetplay.model.user.User;

public interface IUserView {
    int showMenu();
    String getUsername();
    String getPassword();
    String getEmail();
    int getRole();
    int getId();
    void displayAllUsers(List<User> users);
}
