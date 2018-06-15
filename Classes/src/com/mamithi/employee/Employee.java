package com.mamithi.employee;


import com.mamithi.date.Date;

public class Employee {
    private String firstname, lastname;
    private Date birthDate, hireDate;

    public Employee(String first, String last, Date dateOfBirth,
                    Date dateOfHire){
        firstname = first;
        lastname = last;
        birthDate = dateOfBirth;
        hireDate = dateOfHire;
    }

    public String toString(){
        return String.format("%s %s Hired: %s Birhday: %s",
                firstname, lastname, hireDate, birthDate);
    }
}
