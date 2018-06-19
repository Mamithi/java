package com.mamithi;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class PayrollSystemTest {

    public static void main(String[] args){
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Sue", "Jones", "222-222-2222", 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Karen", "Price", "333-33-3333", 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
                "John", "Doe", "444-44-4444", 5000, .04, 300);


        System.out.println("Employees processed individually:\n");

        System.out.printf("%s\n%s: $%,.2f\n\n",
                salariedEmployee, "earned", salariedEmployee.getPaymentAmount());
        System.out.printf("%s \n%s: $%,.2f\n\n",
                hourlyEmployee, "earned", hourlyEmployee.getPaymentAmount());
        System.out.printf("%s \n%s: $%,.2f\n\n",
                commissionEmployee, "earned", commissionEmployee.getPaymentAmount());
        System.out.printf("%s \n%s: $%,.2f\n\n",
                basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.getPaymentAmount());


        Employee[] employees = new Employee[4];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.println("Employees processed polymorphically:\n");

        for( Employee currentEmployee: employees){
            System.out.println(currentEmployee);

            if(currentEmployee instanceof BasePlusCommissionEmployee){
                BasePlusCommissionEmployee  employee = (BasePlusCommissionEmployee) currentEmployee;

                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf(
                        "earned $%,.2f\n\n", currentEmployee.getPaymentAmount()
                );
            }

            for ( int j = 0; j < employees.length; j++){
                System.out.printf("Employee %d is a %s\n", j,
                        employees[j].getClass().getName());
            }
        }
    }


}
