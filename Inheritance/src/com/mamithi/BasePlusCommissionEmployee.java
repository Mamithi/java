package com.mamithi;

public class BasePlusCommissionEmployee {
    private String firstname, lastname, socialSecurityNumber;
    private double grossSales, commissionRate, baseSalary;

    public BasePlusCommissionEmployee(String first, String last,
                                      String ssn, double sales,
                                      double rate, double salary) {
        firstname = first;
        lastname = last;
        socialSecurityNumber = ssn;
        setGrossSales(sales);
        setCommissionRate(rate);
        setBaseSalary(salary);
    }

    public void setFirstname(String first) {
        firstname = first;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setLastname(String last) {
        lastname = last;
    }

    public String getLastname() {
        return lastname;
    }

    public void setSocialSecurityNumber(String ssn) {
        socialSecurityNumber = ssn;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setGrossSales(double sales) {
        if (sales >= 0.0) {
            grossSales = sales;
        } else {
            throw new IllegalArgumentException(
                    "Gross sales must be >= 0.0"
            );
        }
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double rate) {
        if (rate > 0.0 && rate < 1.0) {
            commissionRate = rate;
        } else {
            throw new IllegalArgumentException(
                    "Commission rate must be > 0 and < 1.0"
            );
        }
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setBaseSalary(double salary) {
        if (salary >= 0.0) {
            baseSalary = salary;
        } else {
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0"
            );
        }
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double earnings() {
        return baseSalary + (commissionRate * grossSales);
    }

    @Override
    public String toString() {
        return String.format(
                "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n %s: %.2f ",
                "base-salaried commission employee", firstname, lastname,
                "social security number", socialSecurityNumber,
                "gross sales", grossSales, "commission rate", commissionRate,
                "base salary", baseSalary
        );
    }
}
