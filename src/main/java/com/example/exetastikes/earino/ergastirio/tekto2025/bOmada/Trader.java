package com.example.exetastikes.earino.ergastirio.tekto2025.bOmada;

public class Trader {
    private String name;
    private Cloth[] clothes;
    private int topClothes;

    public Trader(String name) {
        this.name = name;
        this.clothes = new Cloth[10];
    }

    public void addImport(int id, String name, double boughtPrice, int quantity, double listingPrice) throws InvalidQuantityException {
        if (quantity > 1000) {
            throw new InvalidQuantityException("Wrong quantity > 1000.");
        }

        if (this.topClothes >= this.clothes.length) {
            System.out.println("Clothes array is full.");
            return;
        }

        Cloth importedCloth = new Cloth(id, name);
        Item[] items = importedCloth.getItems();

        for (int i = 0; i < quantity; i++) {
            items[i] = new Item(id, boughtPrice, listingPrice);
        }

        importedCloth.setTopItems(quantity);
        this.clothes[topClothes++] = importedCloth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cloth[] getClothes() {
        return clothes;
    }

    public int getTopClothes() {
        return topClothes;
    }

    public void setClothes(Cloth[] clothes) {
        this.clothes = clothes;
    }
}
