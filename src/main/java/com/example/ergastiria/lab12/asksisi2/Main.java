package com.example.ergastiria.lab12.asksisi2;

import gr.ihu.iee.oop.lab.UserInput;

public class Main {
    public static void main(String[] args) throws ArrayOverflow {
        SetClass<Integer> pinakasInteger = new SetClass<>(3);
        for (int i = 0; i < 3; i++) {
            try {
                pinakasInteger.insert(i);
            } catch (ArrayOverflow e) {
                System.out.println(e.getMessage() + "h eisodos #" + i + " den tha eisaxthei.");
                break;
            }
        }

        SetClass<String> pinakasString = new SetClass<>(3);
        // Allakse to condition se i<5 p.x. ean thes na deis to ArrayOverflow exception.
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("Dwse eisodo #" + i + " gia ton pinakasString: ");
                String input = UserInput.getString();
                pinakasString.insert(input);
            } catch (ArrayOverflow e) {
                System.out.println(e.getMessage() + "h eisodos #" + i + " den tha eisaxthei.");
                break;
            }
        }

        SetClass<Integer> pinakasInteger2 = new SetClass<>(3);
        for (int i = 0; i < 3; i++) {
            try {
                pinakasInteger2.insert(i);
            } catch (ArrayOverflow e) {
                System.out.println(e.getMessage() + "h eisodos #" + i + " den tha eisaxthei.");
                break;
            }
        }

        System.out.println(pinakasInteger.toString());
        System.out.println(pinakasString.toString());
        System.out.println(pinakasInteger2.toString());

        System.out.println(SetClass.equals(pinakasInteger.getPinakas(), pinakasInteger2.getPinakas()));
    }
}
