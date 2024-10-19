package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        ExpenseManager expenseManager = new ExpenseManager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter username: ");
                String username = scanner.nextLine();
                System.out.print("Enter password: ");
                String password = scanner.nextLine();
                if (userManager.register(username, password)) {
                    System.out.println("Registration successful!");
                } else {
                    System.out.println("User already exists. Please try again.");
                }
            } else if (choice == 2) {
                System.out.print("Enter username: ");
                String username = scanner.nextLine();
                System.out.print("Enter password: ");
                String password = scanner.nextLine();
                if (userManager.login(username, password)) {
                    System.out.println("Login successful!");
                    DashBoard dashboard = new DashBoard(expenseManager);
                    dashboard.showMenu();
                    break; // Exit login loop
                } else {
                    System.out.println("Invalid credentials. Please try again.");
                }
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
