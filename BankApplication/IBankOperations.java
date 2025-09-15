package BankApplication;

interface IBankOperations {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}
