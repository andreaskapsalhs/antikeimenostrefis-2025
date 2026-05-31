package com.example.exetastikes.earino.tekto2025.aOmada;

public abstract class FinancialOffer {
    private String customerName;
    private double budget;

    public FinancialOffer(String customerName, double budget) {
        this.customerName = customerName;
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
