package src;

import java.util.List;
import java.util.Scanner;

public class DashBoard {
    private ExpenseManager expenseManager;
    private Scanner scanner;

    public DashBoard(ExpenseManager expenseManager) {
        this.expenseManager = expenseManager;
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        while (true) {
            System.out.println("1. Add Expense");
            System.out.println("2. View Expense");
            System.out.println("3. View Expense by Category");
            System.out.println("4. View Expense by Id");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addExpense();
                    break;
                case 2:
                    ViewExpense();
                    break;
                case 3:
                    ViewExpenseByCategory();
                    break;
                case 4:
                    ViewExpenseById();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice pick the valid choice to move further");
            }
        }
    }

    public void addExpense() {
        System.out.println("Enter the category : ");
        String category = scanner.nextLine();
        System.out.println("Enter the Amount Spent : ");
        Double amount = scanner.nextDouble();
        expenseManager.addExpense(category, amount);
        System.out.println("Expenses are added successfully");
    }

    public void ViewExpense() {
        System.out.println("<<<<  Viewing all the Expenses you made >>>> ");
        for (Expense expense : expenseManager.getAllExpense()) {
            System.out.println("Id : " + expense.getId() + " , Category : " + expense.getCategory() + ", Amount : "
                    + expense.getAmount() + ", Time : " + expense.getTime());
        }
    }

    public void ViewExpenseByCategory() {
        System.out.println("<<<<  Viewing all the Expenses by Category >>>> ");
        System.out.println("Enter the Category : ");
        String category = scanner.nextLine();
        List<Expense> expenses = expenseManager.getExpenseByCategory(category);
        System.out.println("Expenses in category \"" + category + "\":");
        for (Expense expense : expenses) {
            System.out.println("ID: " + expense.getId() + ", Amount: " + expense.getAmount() +
                    ", Time: " + expense.getTime());
        }
    }

    public void ViewExpenseById() {
        System.out.print("Enter expense ID: ");
        int id = scanner.nextInt();
        Expense expense = expenseManager.getExpenseId(id);
        if (expense != null) {
            System.out.println("ID: " + expense.getId() + ", Amount: " + expense.getAmount() +
                    ", Time: " + expense.getTime());
        } else {
            System.out.println("Expenses not Found !!!");
        }
    }
}
