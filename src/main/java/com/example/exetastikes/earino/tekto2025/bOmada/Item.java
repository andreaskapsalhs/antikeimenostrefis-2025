package com.example.exetastikes.earino.tekto2025.bOmada;

public class Item extends InventoryAsset {
    private double salesPrice;

    public Item(int id, double traderPrice, double salesPrice) {
        setId(id);
        setTraderPrice(traderPrice);
        this.salesPrice = salesPrice;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }
}
