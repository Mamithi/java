package com.mamithi;

public class BalanceInquiry extends Transaction {
    public BalanceInquiry(int userAccountNumber, Screen atmScreen,
                          BankDatabase atmBankDatabase) {
        super(userAccountNumber, atmScreen, atmBankDatabase);
    }

    @Override
    public void execute() {
        BankDatabase bankDatabase = getBankDatabase();
        Screen screen = getScreen();

        double availableBalance = bankDatabase.getAvailableBalance(getAccountNumber());
        double totalBalance = bankDatabase.getAvailableBalance(getAccountNumber());

        screen.displayMessageLine("\nBalance INformation:");
        screen.displayMessage(" - Available balance: ");
        screen.displayDollarAmmount(availableBalance);
        screen.displayMessage("\n - Total balance:      ");
        screen.displayDollarAmmount(totalBalance);
        screen.displayMessageLine("");

    }
}
