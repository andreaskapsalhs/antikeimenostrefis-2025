package com.example.exetastikes.earino.ergastirio.tekto2025.bOmada;

public class Main {
    public static void main(String[] args) {
        Trader trader = new Trader("Andreas");

        try {
            trader.addImport(101, "T-shirt", 10.0, 3, 15.0);
            trader.addImport(102, "Jeans", 25.0, 2, 40.0);
            trader.addImport(103, "Jacket", 50.0, 1, 80.0);
        } catch (InvalidQuantityException e) {
            System.out.println(e.getMessage());
        }

        double totalTraderValue = 0;
        double totalSalesValue = 0;

        for (int i = 0; i < trader.getTopClothes(); i++) {
            Cloth cloth = trader.getClothes()[i];

            if (cloth != null) {
                System.out.println(cloth.getName() + " -> quantity: " + cloth.getTopItems());
                System.out.println("Purchase value: " + cloth.getTraderInventoryValue());
                System.out.println("Sales value: " + cloth.getInventoryValue());

                totalTraderValue += cloth.getTraderInventoryValue();
                totalSalesValue += cloth.getInventoryValue();
            }
        }

        System.out.println("Total purchase value: " + totalTraderValue);
        System.out.println("Total sales value: " + totalSalesValue);
    }
}
