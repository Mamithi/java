package com.mamithi.employeestatictest;

import com.mamithi.employee.Employee;
import com.mamithi.employeestatic.EmployeeStatic;

public class EmployeeStaticTest {
    public static void main(String[] args) {
        System.out.printf("Employee before instantiation: %d\n",
                EmployeeStatic.getCount());

        EmployeeStatic e1 = new EmployeeStatic("Lawrence", "Mamithi");
        EmployeeStatic e2 = new EmployeeStatic("John", "Doe");

        System.out.println("\nEmployee after instantiation: ");
        System.out.printf("via e1.getCount(): %d\n", e1.getCount());
        System.out.printf("via e2.getCount(): %d\n", e2.getCount());
        System.out.printf("via Employee.getCount(): %d\n",
                EmployeeStatic.getCount());

        System.out.printf("\nEmployee 1: %s %s\nEmployee 2: %s %s\n",
                e1.getFirstname(), e1.getLastname(),
                e2.getFirstname(), e2.getLastname());

        e1 = null;
        e2 = null;
    }
}
