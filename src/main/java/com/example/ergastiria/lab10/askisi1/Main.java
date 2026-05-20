package com.example.ergastiria.lab10.askisi1;

import java.util.Scanner;

public class Main {
    private static ProsPolisi[] ErgaProsPolisi = new ProsPolisi[10];
    private static ProsMetafora[] ErgaProsMetafora = new ProsMetafora[10];
    private static final Scanner scanner = new Scanner(System.in);
    private static int topProsPolisi;
    private static int topProsMetafora;

    public static void main(String[] args) {
        int selection;

        do {
            System.out.println("<--- Menu --->\n" +
                    "1. Enter work of art\n"+
                    "2. Prepare work of art for delivery\n"+
                    "3. Deliver work of art\n"+
                    "4. Display all availabe photographs\n"+
                    "5. Display all availabe paintings\n"+
                    "6. Display all availabe work of arts\n"+
                    "7. Display all work of arts to be delivered\n"+
                    "8. End program\n"+
                    "<--- Enter selection (1-8) : --->\n");

            selection = scanner.nextInt();
            scanner.nextLine();

            switch (selection) {
                case 1:
                    enterArtwork();
                    break;
                case 2:
                    prepareArtwork();
                    break;
                case 3:
                    deliverArtwork();
                    break;
                case 4:
                    displayPhotographs();
                    break;
                case 5:
                    displayPaintings();
                    break;
                case 6:
                    displayArtworks();
                    break;
                case 7:
                    displayArtworksToBeDelivered();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Wrong choice, enter a value between 1 and 8.");
            }
        } while (selection != 8);

        scanner.close();
    }

    private static void enterArtwork() {
        if(topProsPolisi == 10) {
            System.out.println("The list is full.");
            return;
        }

        System.out.println("Photograph or Painting?");
        String type = scanner.nextLine();

        System.out.println("Give description: ");
        String description = scanner.nextLine();

        System.out.println("Give price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        if(type.equalsIgnoreCase("photograph")) {
            boolean isColorful = false;
            String isColorfulStr;
            
            do {
                System.out.println("Is it colorful? ");
                isColorfulStr = scanner.nextLine();

                if(isColorfulStr.equalsIgnoreCase("yes")) {
                    isColorful = true;
                    break;
                } else if(isColorfulStr.equalsIgnoreCase("no")) 
                    break;
            } while(!(isColorfulStr.equalsIgnoreCase("yes") || isColorfulStr.equalsIgnoreCase("no")));

            Photograph newPhotograph = new Photograph(description, price, isColorful);
            ErgaProsPolisi[topProsPolisi++] = newPhotograph;
        } else if(type.equalsIgnoreCase("painting")) {
            System.out.println("Give style: ");
            String style = scanner.nextLine();

            Painting newPainting = new Painting(description, price, style);
            ErgaProsPolisi[topProsPolisi++] = newPainting;
        }
    }

    private static void prepareArtwork() {
        if(topProsPolisi == 0) {
            System.out.println("The list if empty.");
            return;
        }

        int index;

        do {
            System.out.println("Which artwork do you want to prepare? (Select 0-" + topProsPolisi + ")");
            index = scanner.nextInt();
            scanner.nextLine();
        } while (index > 10 || index < 0);

        boolean isFragile = false;
        String isFragileStr;

        do {
            System.out.println("Is it fragile? ");
            isFragileStr = scanner.nextLine();

            if(isFragileStr.equalsIgnoreCase("yes")) {
                isFragile = true;
                break;
            } else if(isFragileStr.equalsIgnoreCase("no"))
                break;
        } while(!(isFragileStr.equalsIgnoreCase("yes") || isFragileStr.equalsIgnoreCase("no")));

        System.out.println("Give volume: ");
        int volume = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Give weight: ");
        int weight = scanner.nextInt();
        scanner.nextLine();

        ProsPolisi artworkToBeDelivered = ErgaProsPolisi[index];
        AgoraParadosi newAgoraParadosi = new AgoraParadosi(artworkToBeDelivered, isFragile, volume, weight);
        ErgaProsMetafora[topProsMetafora++] = newAgoraParadosi;
    }

    private static void deliverArtwork() {
        if(topProsMetafora == 0) {
            System.out.println("There are no artworks to be delivered.");
            return;
        }

        displayArtworksToBeDelivered();

        System.out.println("Give which one to deliver: ");
        int selectionIndex = scanner.nextInt();
        scanner.nextLine();

        /*
            Kathe fora pou vgainei to ErgaProsMetafora[selectionIndex], ta antikeimena DEKSIA tou selectionIndex
            metaferonte -1 index pisw, etsi oste panta na mhn yparxei NULL item anamesa sta items mas para mono
            sto telos tou pinaka. paradeigma, tha einai tis morfis panta: [x, x, x, x, null, null, null].
         */
        for (int i = selectionIndex + 1; i < topProsMetafora; i++) {
            ErgaProsMetafora[i - 1] = ErgaProsMetafora[i];
        }
        topProsMetafora--;
        ErgaProsMetafora[topProsMetafora] = null;
    }

    private static void displayArtworks() {
        if(topProsPolisi == 0) {
            System.out.println("There are no artworks to be displayed.");
            return;
        }

        for (int i = 0; i < topProsPolisi; i++) {
            if(ErgaProsPolisi[i] != null)
                System.out.println("ErgaProsPolisi[" + i + "] " + ErgaProsPolisi[i].toString());
        }
    }

    private static void displayArtworksToBeDelivered() {
        if(topProsMetafora == 0) return;

        for (int i = 0; i < topProsMetafora; i++) {
            if(ErgaProsMetafora[i] != null)
                System.out.println("ErgaProsMetafora[" + i + "] " + ErgaProsMetafora[i].toString());
        }
    }

    private static void displayPaintings() {
        if(topProsPolisi == 0) return;
        int j = 0;

        for (int i = 0; i < topProsPolisi; i++) {
            if(ErgaProsPolisi[i] != null && ErgaProsPolisi[i] instanceof Painting) {
                j++;
                System.out.println("Painting[" + j + "] " + ErgaProsPolisi[i].toString());
            }
        }
    }

    private static void displayPhotographs() {
        if(topProsPolisi == 0) return;
        int j = 0;

        for (int i = 0; i < topProsPolisi; i++) {
            if(ErgaProsPolisi[i] != null && ErgaProsPolisi[i] instanceof Photograph) {
                j++;
                System.out.println("Photograph[" + j + "] " + ErgaProsPolisi[i].toString());
            }
        }
    }
}
