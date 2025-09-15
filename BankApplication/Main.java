package BankApplication;
import java.util.*;
public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Map<Long, Account> accounts = new HashMap<>();
    private static Account loggedInUser = null;

    public static void main(String[] args) {
        while (true) {
            if (loggedInUser == null) {
                // Only show signup/login when no one is logged in
                System.out.println("\n====== Bank System ======");
                System.out.println("1. Sign Up");
                System.out.println("2. Login");
                System.out.println("3. Exit");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1 -> {
                        signUp();
                        // After signup, auto-login
                        accountMenu();
                    }
                    case 2 -> login();
                    case 3 -> {
                        System.out.println("Thank you for using our Bank!");
                        return;
                    }
                    default -> System.out.println("Invalid choice.");
                }
            } else {
                // If already logged in → show account menu directly
                accountMenu();
            }
        }
    }

    private static void signUp() {
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();

        System.out.print("Set your Password: ");
        String password = sc.nextLine();

        System.out.print("Enter Initial Deposit Amount: ");
        double deposit = sc.nextDouble();
        sc.nextLine();

        System.out.println("Select Account Type: ");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        int type = sc.nextInt();
        sc.nextLine();

        Account newAcc;
        if (type == 1) {
            newAcc = new SavingsAccount(name, password, deposit);
        } else if (type == 2) {
            newAcc = new CurrentAccount(name, password, deposit);
        } else {
            System.out.println("Invalid account type.");
            return;
        }

        accounts.put(newAcc.getAccountNumber(), newAcc);
        loggedInUser = newAcc; // Auto login after signup

        System.out.println("\nAccount Created Successfully!");
        System.out.println("Account Number: " + newAcc.getAccountNumber());
        System.out.println("Account Type: " + newAcc.getAccountType());

        // Immediately ask for transactions
        System.out.print("\nDo you want to deposit money now? (yes/no): ");
        String depChoice = sc.nextLine();
        if (depChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter deposit amount: ");
            double dep = sc.nextDouble();
            sc.nextLine();
            newAcc.deposit(dep);
        }

        System.out.print("\nDo you want to withdraw money now? (yes/no): ");
        String wdChoice = sc.nextLine();
        if (wdChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter withdrawal amount: ");
            double wd = sc.nextDouble();
            sc.nextLine();
            newAcc.withdraw(wd);
        }

        System.out.println("Final Balance: Rs" + newAcc.getBalance());
    }

    private static void login() {
        System.out.print("Enter Account Number: ");
        long accNum = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        Account acc = accounts.get(accNum);

        if (acc != null && acc.validatePassword(pass)) {
            loggedInUser = acc;
            System.out.println("\nWelcome, " + acc.getName() + "! (" + acc.getAccountType() + ")");
            accountMenu();
        } else {
            System.out.println("Invalid account number or password.");
        }
    }

    private static void accountMenu() {
        while (loggedInUser != null) {
            System.out.println("\n--- Account Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Logout");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Balance: Rs" + loggedInUser.getBalance());
                case 2 -> {
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    loggedInUser.deposit(dep);
                }
                case 3 -> {
                    System.out.print("Enter withdrawal amount: ");
                    double wd = sc.nextDouble();
                    loggedInUser.withdraw(wd);
                }
                case 4 -> {
                    System.out.println("Logged out successfully.");
                    loggedInUser = null; // back to signup/login
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}