package com.example.ergastiria.lab10.askisi1;

public class Painting implements ProsPolisi {
    private String description;
    private double price;
    private String style;
    private double cataloguePrice;
    private double lowestAcceptablePrice;

    public Painting(String description, double price, String style) {
        this.description = description;
        this.price = price;
        this.style = style;
        this.cataloguePrice = getCataloguePrice();
        this.lowestAcceptablePrice = getLowestAcceptablePrice(80);
    }

    public String getStyle() {
        return this.style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCataloguePrice() {
        return this.price * 100;
    }

    @Override
    public double getLowestAcceptablePrice(double percentage) {
        return this.getCataloguePrice() * (percentage/100);
    }

    @Override
    public String toString() {
        return "Painting{" +
                "description='" + this.description + '\'' +
                ", price=" + this.price +
                ", style='" + this.style + '\'' +
                '}';
    }
}
