package com.mamithi;

public abstract class Transaction {
    private int accountNumber;
    private Screen screen;
    private BankDatabase bankDatabase;

    public Transaction(int userAccountNumber, Screen atmSreen,
                       BankDatabase atmBankDatabase) {
        accountNumber = atmBankDatabase;
        screen = atmSreen;
        bankDatabase = BankDatabase;
    }
}
