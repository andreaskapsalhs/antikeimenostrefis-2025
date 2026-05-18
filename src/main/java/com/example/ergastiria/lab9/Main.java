package com.example.ergastiria.lab9;

import gr.ihu.iee.oop.lab.UserInput;

public class Main {
    public static void main(String[] args) {
        int N;

        if(args.length > 0) N = Integer.parseInt(args[0]);
        else {
            System.out.print("Δώσε αριθμό N: ");
            N = UserInput.getInteger();
        }

        Tilefono[] tilefonaEpixeirisis = new Tilefono[N];

        for (int i = 0; i < N; i++) {
            double pithanotita = Math.random();

            /*
             *  Ftiaxnei random arithmo XWRIS to prwto psifio (2 gia stathera h 6 gia kinita)
             *  To prwto psifio mpainei kata tin klisi tou constructor pio katw
            */
            String arithmos = "";
            for (int j = 0; j < 9; j++)
                arithmos += (int)(Math.random() * 10);

            if(pithanotita <= 0.6)
                tilefonaEpixeirisis[i] = new Stathero("2" + arithmos);
            else
                tilefonaEpixeirisis[i] = new Kinito("6" + arithmos);
        }

        int X = (int)(Math.random() * (2000 - 100 + 1)) + 100;
        for (int i = 100; i < X; i++) {
            double pithanotita = Math.random();

            int randomThesi = (int)(Math.random() * N);
            Tilefono tilefonoOutgoing = tilefonaEpixeirisis[randomThesi];
            int randomDeuterolepta = (int)(Math.random() * (600 - 5 + 1)) + 5;

            /*
             *  Ftiaxnei random arithmo XWRIS to prwto psifio (2 gia stathera h 6 gia kinita)
             *  To prwto psifio mpainei pio katw analoga me tin pithanotita
            */
            String randomArithmos = "";
            for (int j = 0; j < 9; j++)
                randomArithmos += (int)(Math.random() * 10);

            if(pithanotita <= 0.6) {
                tilefonoOutgoing.setDeuteroleptaProsStathera(randomDeuterolepta);
                randomArithmos = "2" + randomArithmos;
            }
            else {
                tilefonoOutgoing.setDeuteroleptaProsKinita(randomDeuterolepta);
                randomArithmos = "6" + randomArithmos;
            }

            tilefonoOutgoing.dial(randomArithmos);
        }

        System.out.println("<--- KATALOGOS TILEFWNWN --->");
        for (int i = 0; i < N; i++) {
            Tilefono tilefono = tilefonaEpixeirisis[i];

            System.out.print("Tilefwno: " + tilefono.getArithmosTilefonou() + " | ");
            System.out.print("Kostos: " + tilefono.calculateCost() + "\n");
        }
        System.out.println("<--- TELOS KATALOGOU --->\n");

        int sumProsStathera = 0;
        double kostosProsStathera = 0;
        for (int i = 0; i < N; i++) {
            Tilefono tilefono = tilefonaEpixeirisis[i];

            sumProsStathera += tilefono.getDeuteroleptaProsStathera();
            if(tilefono instanceof Kinito) {
                kostosProsStathera +=
                        tilefono.getDeuteroleptaProsStathera()
                                * Tilefono.kosthKlisewn[2];
            } else {
                kostosProsStathera +=
                        tilefono.getDeuteroleptaProsStathera()
                                * Tilefono.kosthKlisewn[0];
            }
        }
        System.out.println("<--- SYNOLO PROS STATHERA KAI KOSTOS --->");
        System.out.println("Synolo: " + sumProsStathera);
        System.out.println("Kostos: " + kostosProsStathera);
        System.out.println("<--- TELOS --->\n");

        int sumProsKinita = 0;
        double kostosProsKinita = 0;
        for (int i = 0; i < N; i++) {
            Tilefono tilefono = tilefonaEpixeirisis[i];

            sumProsKinita += tilefono.getDeuteroleptaProsKinita();
            if(tilefono instanceof Kinito) {
                kostosProsKinita +=
                        tilefono.getDeuteroleptaProsStathera()
                                * Tilefono.kosthKlisewn[1];
            } else {
                kostosProsKinita +=
                        tilefono.getDeuteroleptaProsStathera()
                                * Tilefono.kosthKlisewn[3];
            }
        }
        System.out.println("<--- SYNOLO PROS KINITA KAI KOSTOS --->");
        System.out.println("Synolo: " + sumProsKinita);
        System.out.println("Kostos: " + kostosProsKinita);
        System.out.println("<--- TELOS --->\n");

        System.out.println("<--- SYNOLIKA EXODA EPIXEIRHSHS --->");
        System.out.println(kostosProsKinita + kostosProsStathera);
        System.out.println("<--- TELOS --->\n");}
}
