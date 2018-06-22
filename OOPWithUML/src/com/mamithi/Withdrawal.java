package com.mamithi;

import sun.awt.X11.Screen;

// Class withdrawal represents an ATM withrdwawal transaction
public class Withdrawal extends Transaction {
    private int accountNumber;
    private double amount;

    private Screen screen;
    private Keypad keypad;
    private CashDispenser cashDispenser;
    private BankDatabase bankDatabase;

    public Withdrawal() {

    }

    @Override
    public void execute() {

    }

}
