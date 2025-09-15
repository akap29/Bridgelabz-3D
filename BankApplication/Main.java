package BankApplication;
import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Map<String, User> accounts = new HashMap<>(); // login by username
    private static User loggedInUser = null;

    public static void main(String[] args) {
        while (true) {
            if (loggedInUser == null) {
                System.out.println("\n====== SBI Bank System ======");
                System.out.println("1. Sign Up");
                System.out.println("2. Login");
                System.out.println("3. Exit");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1 -> signUp();
                    case 2 -> login();
                    case 3 -> {
                        System.out.println("Thank you for using our Bank!");
                        return;
                    }
                    default -> System.out.println("Invalid choice.");
                }
            } else {
                accountMenu();
            }
        }
    }

    private static void signUp() {
        System.out.print("Enter your Username: ");
        String name = sc.nextLine();

        if (accounts.containsKey(name)) {
            System.out.println("Username already exists. Please choose a different one.");
            return;
        }

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

        User newAcc;
        if (type == 1) {
            newAcc = new SavingsAccount(name, password, deposit);
        } else if (type == 2) {
            newAcc = new CurrentAccount(name, password, deposit);
        } else {
            System.out.println("Invalid account type.");
            return;
        }

        accounts.put(name, newAcc);
        loggedInUser = newAcc;

        System.out.println("\nAccount Created Successfully!");
        System.out.println("Username: " + newAcc.getName());
        System.out.println("Account Number: " + newAcc.getAccountNumber());
        System.out.println("Account Type: " + newAcc.getAccountType());
        System.out.println("Initial Balance: Rs" + newAcc.getBalance());
    }

    private static void login() {
        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        User acc = accounts.get(user);

        if (acc != null && acc.validatePassword(pass)) {
            loggedInUser = acc;
            System.out.println("\nWelcome, " + acc.getName() + "! (" + acc.getAccountType() + ")");
            accountMenu();
        } else {
            System.out.println("Invalid username or password.");
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
                    loggedInUser = null;
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
