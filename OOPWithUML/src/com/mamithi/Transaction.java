package com.mamithi;

public abstract class Transaction {
    private int accountNumber;
    private Screen screen;
    private BankDatabase bankDatabase;

    public Transaction(int userAccountNumber, Screen atmSreen,
                       BankDatabase atmBankDatabase) {
        accountNumber = userAccountNumber;
        screen = atmSreen;
        bankDatabase = atmBankDatabase;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Screen getScreen() {
        return screen;
    }

    public BankDatabase getBankDatabase() {
        return bankDatabase;
    }

    abstract public void execute();
}
