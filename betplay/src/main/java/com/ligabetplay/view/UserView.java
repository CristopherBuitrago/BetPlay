package com.ligabetplay.view;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.ligabetplay.MyUtils;
import com.ligabetplay.model.user.User;

public class UserView implements IMenu{
    private Scanner scanner;

    public UserView () {
        scanner = new Scanner(System.in);
    }

    @Override
    public int showMenu() {
        System.out.println("--------Welcome--------");
        System.out.println("1. Register");
        System.out.println("2. Loggin");
        System.out.print("[-] ");
        int option = scanner.nextInt();
        scanner.nextLine();

        return option;
    }

    public User getUserDetails(){
        System.out.println("Username: ");
        String username = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();
        System.out.println("Role Id: ");
        int role = scanner.nextInt();
        scanner.nextLine();

        return new User(0, username, email, password, role);
    }

    public int getUserId(){
        System.out.println("User Id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        return id;
    }

    public void showUsers(List<User> users) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int pageSize = 3;
        int totalUsers = users.size();
        int totalPages = (int) Math.ceil((double) totalUsers / pageSize);
        String leftAlignFormat = "| %-4d | %-17s | %-30s | %-4d |%n";

        for (int page = 1; page <= totalPages; page++) {
            System.out.format("+------+------------------+-------------------------------+-------+%n");
            System.out.format("| ID   | Username         | Email                         | Role  |%n");
            System.out.format("+------+------------------+-------------------------------+-------+%n");

            int start = (page - 1) * pageSize;
            int end = Math.min(start + pageSize, totalUsers);
            for (int i = start; i < end; i++) {
                User user = users.get(i);
                System.out.format(leftAlignFormat, user.getId(), user.getUsername(), user.getEmail(), user.getRole());
            }

            System.out.format("+------+------------------------------------------+%n");
            System.out.println("Page " + page + " of " + totalPages);


            if (page <= totalPages) {
                System.out.println("Press enter to show next page...");
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

}
