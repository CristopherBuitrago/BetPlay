package com.ligabetplay;

import com.ligabetplay.controller.user.IController;
import com.ligabetplay.controller.user.UserController;
import com.ligabetplay.model.user.IUserService;
import com.ligabetplay.model.user.UserService;
import com.ligabetplay.view.user.IUserView;
import com.ligabetplay.view.user.UserView;

public class Main {
    public static void main(String[] args) {
        /*
         * make sure to create the database in Resources folder -> db -> commands -> ddl.sql
         */
        // loggin
        IUserView view = new UserView();
        IUserService service = new UserService();
        IController controller = new UserController(view, service);

        controller.start();
    }
}