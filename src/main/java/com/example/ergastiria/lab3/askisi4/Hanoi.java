package com.example.ergastiria.lab3.askisi4;

/**
 * @see <a href="https://en.wikipedia.org/wiki/Tower_of_Hanoi">Tower Of Hanoi</a>
 */
public class Hanoi {
    public static void main(String[] args) {
        // Exoume 3 diskous, theloume na tous metakinisoume apo ton 1o ston 3o me voithitiko ton 2o.
        metakinise(3, 1, 3, 2);
    }

    /**
     * @param n           O arithmos twn diskwn pou thes na kounithoun.
     * @param arxikos:    O arxikos stilos pou vriskontai o/oi diskos/oi.
     * @param telikos     O telikos stilos ston opoion tha kataliksoun o/oi diskos/oi.
     * @param voithitikos O voithitikos stilos pou tha xrisimopoihthei.
     */
    public static void metakinise(int n, int arxikos, int telikos, int voithitikos) {
        if (n == 1) {
            System.out.println(arxikos + " -> " + telikos);
            return;
        }

        /**
         * (!) TA SXOLIA AFOROUN THN DOKIMH GIA n=3 STYLOUS.
         * 1o VHMA:
         * metakinoume tous n-1 diskous,
         * apo ton 1o stylo,
         * ston 2o stylo,
         *    |       |       |
         *    |       |       |
         *    |      _|_      |
         * ___|___  __|__     |
         * Στύλ.1  Στύλ.2  Στύλ.3
         */
        metakinise(n - 1, arxikos, voithitikos, telikos);

        /**
         *  2o VHMA:
         *  metakinoume ton enan disko pou emeine
         *  apo ton 1o stylo,
         *  ston 3o stylo,
         *  me voithitiko ton 2o stylo:
         *    |       |       |
         *    |       |       |
         *    |      _|_      |
         *    |     __|__  ___|___
         * Στύλ.1  Στύλ.2  Στύλ.3
         */
        metakinise(1, arxikos, telikos, voithitikos);

        /**
         *  3o VHMA:
         *  metakinoume tous ypoloipous diskous
         *  apo ton 2o stylo,
         *  ston 3o stylo,
         *  me voithitiko ton 1o stylo:
         *    |       |       |
         *    |       |      _|_
         *    |       |     __|__
         *    |       |    ___|___
         * Στύλ.1  Στύλ.2  Στύλ.3
         */
        metakinise(n - 1, voithitikos, telikos, arxikos);
    }
}
