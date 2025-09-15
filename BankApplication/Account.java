package BankApplication;

abstract class Account implements IBankOperations {
    private static long accountCounter = 1000;
    private final long accountNumber;
    private final String name;
    private final String password;
    protected double balance;

    public Account(String name, String password, double initialDeposit) {
        this.accountNumber = ++accountCounter;
        this.name = name;
        this.password = password;
        this.balance = initialDeposit;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public boolean validatePassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public abstract String getAccountType();
}
