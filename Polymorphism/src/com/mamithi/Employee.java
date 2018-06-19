package com.mamithi;

public abstract class Employee {
    private String firstname, lastname, socialSecurityNumber;

    public Employee(String first, String last, String ssn) {
        firstname = first;
        lastname = last;
        socialSecurityNumber = ssn;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setFirstname(String first) {
        this.firstname = first;
    }

    public void setLastname(String last) {
        this.lastname = last;
    }

    public void setSocialSecurityNumber(String ssn) {
        this.socialSecurityNumber = ssn;
    }

    @Override
    public String toString() {
        return String.format("%s %s\nsocial security number: %s", getFirstname(), getLastname(), getSocialSecurityNumber());
    }

    public abstract double earnings();
}
