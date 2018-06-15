package com.mamithi.employeetest;

import com.mamithi.date.Date;
import com.mamithi.employee.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Date birth = new Date(7, 24, 1993);
        Date hire = new Date(3, 12, 2012);
        Employee employee = new Employee("Lawrence", "Mamithi", birth, hire);

        System.out.println(employee);
    }
}
