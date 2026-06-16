package com.example.exetastikes.earino.ergastirio.tekto2025.bOmada;

public abstract class InventoryAsset {
    private int id;
    private double traderPrice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTraderPrice() {
        return traderPrice;
    }

    public void setTraderPrice(double traderPrice) {
        this.traderPrice = traderPrice;
    }
}
