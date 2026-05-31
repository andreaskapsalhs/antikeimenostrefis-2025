package com.example.exetastikes.earino.tekto2025.bOmada;

public class Cloth implements IProductInventory {
    private int id;
    private String name;
    public int topItems;
    private Item[] items = new Item[1000];

    public Cloth(int id, String name) {
        this.id = id;
        this.name = name;
        this.topItems = 0;
    }

    @Override
    public double getInventoryValue() {
        double sum = 0;

        for (int i = 0; i < topItems; i++) {
            sum += items[i].getSalesPrice();
        }

        return sum;
    }

    public double getTraderInventoryValue() {
        double sum = 0;

        for (int i = 0; i < topItems; i++) {
            sum += items[i].getTraderPrice();
        }

        return sum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item[] getItems() {
        return items;
    }

    public int getTopItems() {
        return topItems;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public void setTopItems(int topItems) {
        this.topItems = topItems;
    }
}
