package com.mamithi;

public class CommissionEmployee extends Employee {

    private double grossSales, commissionRate;

    public CommissionEmployee(String first, String last, String ssn,
                              double sales, double rate) {
        super(first, last, ssn);
        setGrossSales(sales);
        setCommissionRate(rate);
    }

    public void setGrossSales(double sales) {
        if (sales >= 0.0) {
            grossSales = sales;
        } else {
            throw new IllegalArgumentException(
                    "Sales must be >= 0.0"
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

    @Override
    public double getPaymentAmount() {
        return getGrossSales() * getCommissionRate();
    }

    @Override
    public String toString() {
        return String.format("%s: %s\n%s: $%,.2f; %s: %.2f",
                "Commission employee", super.toString(),
                "Gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }

}
