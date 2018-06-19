package com.mamithi;

public class PayableInterfaceTest {

    public static void main(String[] args) {
        Payable[] payables = new Payable[4];

        payables[0] = new Invoice("01234", "seat", 2, 375.00);
        payables[1] = new Invoice("56789", "tire", 3, 38.00);
        payables[2] = new SalariedEmployee("John", "Doe", "111-11-1111", 800.00);
        payables[3] = new SalariedEmployee("Jane", "Doe", "22-11-2222", 1200.00);

        System.out.println(
                "Invoices and Employees processed polymorphically:\n"
        );

        for (Payable currentPayable : payables) {
            System.out.printf("%s \n%s: $%,.2f\n\n",
                    currentPayable.toString(),
                    "Payment due", currentPayable.getPaymentAmount());
        }
    }
}
