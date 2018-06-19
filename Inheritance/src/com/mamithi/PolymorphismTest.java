package com.mamithi;

public class PolymorphismTest {
    public static void main(String[] args) {

        CommissionEmployee commissionEmployee = new CommissionEmployee(
                "Sue", "Jones", "222-22-2222", 10000, .06
        );

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
                "John", "Doe", "333-33-3333", 5000, .04, 300
        );

        System.out.printf("%s %s:\n\n%s\n\n",
                "Call CommmissionEmployee oString with super class reference ",
                "to superclass object", commissionEmployee);

        System.out.printf("%s %s:\n\n%s\n\n",
                "Call BasePlusCommissionEmployee toString with subclass",
                "refrence to subclass object",
                basePlusCommissionEmployee.toString());
        CommissionEmployee commissionEmployee1 = basePlusCommissionEmployee;

        System.out.printf("%s %s: \n\n%s\n\n",
                "Call BasePlussCommissionEmployee toString with superclass",
                "reference to subclass object", commissionEmployee1.toString());
    }
}
