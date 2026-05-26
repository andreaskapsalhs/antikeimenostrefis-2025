package com.example.simeioseis;

/*
 * ─────────────────────────────────────────────────────────────────────────
 *  SIMEIOSEIS.java - Σημειώσεις OOP | Αλγόριθμοι Ταξινόμησης & Αναζήτησης
 *  Βασισμένο στους αλγόριθμους που χρησιμοποιούνται στα εργαστήρια.
 * ─────────────────────────────────────────────────────────────────────────
*/
public class Simeioseis {
    public static int[] bubbleSort(int[] pinakas) {
        for (int i = 0; i < pinakas.length - 1; i++) {
            for (int j = pinakas.length - 1; j > i; j--) {
                if (pinakas[j - 1] > pinakas[j]) {
                    int temp    = pinakas[j];
                    pinakas[j]  = pinakas[j - 1];
                    pinakas[j - 1] = temp;
                }
            }
        }
        return pinakas;
    }

    public static int[] bubbleSortRecursive(int[] pinakas, int i) {
        if (i >= pinakas.length - 1) return pinakas;

        for (int j = pinakas.length - 1; j > i; j--) {
            if (pinakas[j - 1] > pinakas[j]) {
                int temp      = pinakas[j];
                pinakas[j]    = pinakas[j - 1];
                pinakas[j - 1] = temp;
            }
        }

        return bubbleSortRecursive(pinakas, i + 1);
    }

    public static int[] selectionSort(int[] pinakas) {
        for (int i = 0; i < pinakas.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < pinakas.length; j++) {
                if (pinakas[j] < pinakas[minIndex]) {
                    minIndex = j;
                }
            }

            int temp           = pinakas[minIndex];
            pinakas[minIndex]  = pinakas[i];
            pinakas[i]         = temp;
        }
        return pinakas;
    }

    public static int[] selectionSortRecursive(int[] pinakas, int i) {
        if (i >= pinakas.length - 1) return pinakas;
        int minIndex = i;

        for (int j = i + 1; j < pinakas.length; j++) {
            if (pinakas[j] < pinakas[minIndex]) {
                minIndex = j;
            }
        }

        int temp          = pinakas[minIndex];
        pinakas[minIndex] = pinakas[i];
        pinakas[i]        = temp;

        return selectionSortRecursive(pinakas, i + 1);
    }

    public static int[] insertionSort(int[] pinakas) {
        for (int i = 1; i < pinakas.length; i++) {
            int temp = pinakas[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (pinakas[j] > temp) {
                    pinakas[j + 1] = pinakas[j];
                } else {
                    break;
                }
            }
            pinakas[j + 1] = temp;
        }
        return pinakas;
    }

    public static void quickSort(int[] pinakas, int arxi, int telos) {
        if (arxi < telos) {
            int pivot = pinakas[telos];
            int i = arxi - 1;

            for (int j = arxi; j < telos; j++) {
                if (pinakas[j] <= pivot) {
                    i++;
                    int temp    = pinakas[i];
                    pinakas[i]  = pinakas[j];
                    pinakas[j]  = temp;
                }
            }

            int temp          = pinakas[i + 1];
            pinakas[i + 1]    = pinakas[telos];
            pinakas[telos]    = temp;

            int partitionIndex = i + 1;

            quickSort(pinakas, arxi, partitionIndex - 1); // Αριστερά του pivot
            quickSort(pinakas, partitionIndex + 1, telos); // Δεξιά του pivot
        }
    }

    public static void mergeSort(int[] pinakas, int arxi, int telos) {
        if (telos - arxi <= 1) return;

        int mesi = arxi + (telos - arxi) / 2;

        mergeSort(pinakas, arxi, mesi);
        mergeSort(pinakas, mesi, telos);

        int[] tempPinakas = new int[telos - arxi];
        int i = arxi, j = mesi, k = 0;

        while (i < mesi && j < telos) {
            if (pinakas[i] < pinakas[j]) {
                tempPinakas[k++] = pinakas[i++];
            } else {
                tempPinakas[k++] = pinakas[j++];
            }
        }

        while (i < mesi)  tempPinakas[k++] = pinakas[i++];
        while (j < telos) tempPinakas[k++] = pinakas[j++];

        for (i = 0; i < tempPinakas.length; i++) {
            pinakas[arxi + i] = tempPinakas[i];
        }
    }

    public static int serialSearch(int[] pinakas, int target) {
        int thesi = -1;
        for (int i = 0; i < pinakas.length; i++) {
            if (pinakas[i] == target) {
                thesi = i;
                break;
            }
        }
        return thesi;
    }

    public static int binarySearch(int[] pinakas, int target) {
        int arxi  = 0;
        int telos = pinakas.length - 1;

        while (arxi <= telos) {
            int mesi = arxi + (telos - arxi) / 2;

            if (pinakas[mesi] == target) {
                return mesi;
            } else if (pinakas[mesi] < target) {
                arxi = mesi + 1;
            } else {
                telos = mesi - 1;
            }
        }

        return -1;
    }

    public static int binarySearchRecursive(int[] pinakas, int target, int arxi, int telos) {
        if (arxi > telos) return -1;

        int mesi = arxi + (telos - arxi) / 2;

        if (pinakas[mesi] == target) {
            return mesi;
        }
        if (pinakas[mesi] > target) {
            return binarySearchRecursive(pinakas, target, arxi, mesi - 1);
        }
        return binarySearchRecursive(pinakas, target, mesi + 1, telos);
    }
}