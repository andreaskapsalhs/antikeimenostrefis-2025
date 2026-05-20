package com.example.ergastiria.lab10.askisi1;

public class Photograph implements ProsPolisi {
    private String description;
    private double price;
    private boolean isColorful;
    private double cataloguePrice;
    private double lowestAcceptablePrice;

    public Photograph(String description, double price, boolean isColorful) {
        this.description = description;
        this.price = price;
        this.isColorful = isColorful;
        this.price = price;
        this.cataloguePrice = getCataloguePrice();
        this.lowestAcceptablePrice = getLowestAcceptablePrice(80);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isColorful() {
        return isColorful;
    }

    public void setColorful(boolean colorful) {
        isColorful = colorful;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCataloguePrice() {
        return this.price * 100;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public double getLowestAcceptablePrice(double percentage) {
        return this.getCataloguePrice() * (percentage/100);
    }

    @Override
    public String toString() {
        return "Photograph{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", isColorful=" + isColorful +
                ", cataloguePrice=" + cataloguePrice +
                ", lowestAcceptablePrice=" + lowestAcceptablePrice +
                '}';
    }
}
