package com.mamithi.employeestatic;

public class EmployeeStatic {
    private String firstname, lastname;
    private static int count = 0;

    public EmployeeStatic(String first, String last) {
        firstname = first;
        lastname = last;

        ++count;
        System.out.printf("Employee constructor: %s %s: count = %d\n",
                firstname, lastname, count);
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public static int getCount(){
        return count;
    }
}
