package com.mamithi.accounttest;

import com.mamithi.account.Account;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args){
        Account acc1 = new Account(50.00);
        Account acc2 = new Account(-7.53);

        System.out.printf("account1 balance: $%.2f\n", acc1.getBalance());
        System.out.printf("account2 balance: $%.2f\n", acc2.getBalance());

        Scanner input = new Scanner(System.in);
        double depositAmount;

        System.out.print("Enter deposit amount for account 1: ");
        depositAmount = input.nextDouble();
        System.out.printf("\nadding %.2f to account 1 balance\n\n", depositAmount);
        acc1.credit(depositAmount);

        System.out.printf("Account 1 balance: $%.2f\n", acc1.getBalance());
        System.out.printf("Account 2 balance: $%.2f\n", acc2.getBalance());

        System.out.print("Enter deposit amount for account 2: ");
        depositAmount = input.nextDouble();
        System.out.printf("\nadding %.2f to account 2 balance\n\n", depositAmount);
        acc2.credit(depositAmount);

        System.out.printf("Account 1 balance: $%.2f\n", acc1.getBalance());
        System.out.printf("Account 2 balance: $%.2f\n", acc2.getBalance());
    }
}
