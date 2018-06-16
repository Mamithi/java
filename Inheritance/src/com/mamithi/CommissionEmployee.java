package com.mamithi;

public class CommissionEmployee extends Object {
    private String firstname, lastname, socialSecurityNumber;
    private double grossSales, commissionRate;

    public CommissionEmployee(String first, String last, String ssn,
                              double sales, double rate) {
        firstname = first;
        lastname = last;
        socialSecurityNumber = ssn;
        setGrossSales(sales);
        setCommissionRate(rate);
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
        if (sales >= 0.00) {
            grossSales = sales;
        } else {
            throw new IllegalArgumentException(
                    "Gross sales must be >= to 0.00"
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
                    "Commission rate must be > 0.0 and < 1.0"
            );
        }
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                "comission employee", getFirstname(), getLastname(),
                "social security number", getSocialSecurityNumber(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate()
        );
    }
}
