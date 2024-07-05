package com.ligabetplay.controller.user;

import java.sql.SQLException;
import java.util.List;

import com.ligabetplay.model.user.IUserService;
import com.ligabetplay.model.user.User;
import com.ligabetplay.view.user.IUserView;

public class UserController implements IController {
    private IUserView view;
    private IUserService userService;
    
    public UserController(IUserView view, IUserService service) {
        this.view = view;
        this.userService = service;
    }
    @Override
    public void start() {
        while (true) {
            int option = view.showMenu();
            switch (option) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    loginUser();
                    break;
                case 3:
                    displayAllUsers();
                    break;
                case 4:
                    updateUser();
                    break;
                case 5:
                    deleteUser();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    } 

    public void registerUser() {
        String username = view.getUsername();
        String email = view.getEmail();
        String password = view.getPassword();
        int role = view.getRole();
        
        User user = new User();

        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        user.setRole(role);

        try {
            userService.registerUser(user);
            System.out.println("Usuario registrado exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al registrar usuario: " + e.getMessage());
        }
    }

    public void loginUser() {
        String username = view.getEmail();
        String password = view.getPassword();
        
        User user = new User();

        user.setEmail(username);
        user.setPassword(password);

        try {
            boolean loggedIn = userService.loginUser(user);
            if (loggedIn) {
                System.out.println("Usuario loggeado correctamente");
            } else {
                System.out.println("Contrasena o correo invalido.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al iniciar sesion: " + e.getMessage());
        }
    }

    public void displayAllUsers() {
        try {
            List<User> users = userService.getAllUsers();
            view.displayAllUsers(users);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al mostrar usuarios: " + e.getMessage());
        }
    }

    public void deleteUser() {
        int id = view.getId();
        
        User user = new User();

        user.setId(id);

        try {
            userService.deleteUser(user);
            System.out.println("Usuario eliminado con exito.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al eliminar usuario: " + e.getMessage());
        }
    }

    public void updateUser() {
        int id = view.getId();
        String username = view.getUsername();
        String email = view.getEmail();
        String password = view.getPassword();
        int role = view.getRole();
        
        User user = new User();

        user.setId(id);
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        user.setRole(role);

        try {
            userService.updateUser(user);
            System.out.println("Usuario modificado con exito.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al modificar usuario: " + e.getMessage());
        }
    }
}