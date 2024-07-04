package com.ligabetplay.controller;

import com.ligabetplay.model.user.UserService;
import com.ligabetplay.view.UserView;

public class UserController implements IStartable{
    private UserView view;
    private UserService dao;

    public UserController(UserView view, UserService dao) {
        this.view = view;
        this.dao = dao;
    }

    @Override
    public void start() {
        while (true) {
            int choise = view.showMenu();
            try {
                switch (choise) {
                    case 1:
                        
                        break;
                    
                    case 2:
                        register();
                        break;

                    default:
                        break;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
