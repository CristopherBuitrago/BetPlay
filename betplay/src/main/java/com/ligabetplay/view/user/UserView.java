package com.ligabetplay.view.user;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.ligabetplay.MyUtils;
import com.ligabetplay.model.user.User;

public class UserView implements IUserView {
    private Scanner scanner;

    public UserView() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public int showMenu() {
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Display All Users");
        System.out.println("4. Update User");
        System.out.println("5. Delete User");
        System.out.println("6. Exit");
        System.out.print("Choose an option: ");
        
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        return choice;
    }

    

    @Override
    public void displayAllUsers(List<User> users) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int pageSize = 3;
        int totalUsers = users.size();
        int totalPages = (int) Math.ceil((double) totalUsers / pageSize);
        String leftAlignFormat = "| %-4d | %-15s | %-23s | %-7d |%n";

        for (int page = 1; page <= totalPages; page++) {
            System.out.format("+------+----------------+-------------------------+--------------+%n");
            System.out.format("| ID   | Username       | Email                   | Role ID      |%n");
            System.out.format("+------+----------------+-------------------------+--------------+%n");

            int start = (page - 1) * pageSize;
            int end = Math.min(start + pageSize, totalUsers);
            for (int i = start; i < end; i++) {
                User user = users.get(i);
                System.out.format(leftAlignFormat, user.getId(), user.getUsername());
            }

            System.out.format("+------+----------------+-------------------------+--------------+%n");
            System.out.println("                           Page " + page + " Of                           " + totalPages);


            if (page <= totalPages) {
                System.out.println("                     Press enter to continue...                     ");
                try {

                            System.in.read();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                scanner.nextLine();
                MyUtils.cls();
            }
        }
    }

    @Override
    public int getId() {
        System.out.print("Input user id: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        return id;
    }

    @Override
    public String getUsername() {
        System.out.print("Input username: ");
        String username = scanner.nextLine();

        return username;
    }

    @Override
    public String getEmail() {
        System.out.print("Input email: ");
        String email = scanner.nextLine();

        return email;
    }

    @Override
    public String getPassword() {
        System.out.print("Input password: ");
        String password = scanner.nextLine();

        return password;
    }

    @Override
    public int getRole() {
        System.out.print("Input role id: ");
        int roleId = scanner.nextInt();
        scanner.nextLine();

        return roleId;
    }
}
