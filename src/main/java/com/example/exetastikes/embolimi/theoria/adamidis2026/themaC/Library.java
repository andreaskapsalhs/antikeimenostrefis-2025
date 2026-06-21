package com.example.exetastikes.embolimi.theoria.adamidis2026.themaC;

public class Library {
    private String name;
    private LibraryItem[] pinakas;

    public void deleteLibraryItem(String id) {
        for (int i = 0; i < pinakas.length; i++) {
            if(pinakas[i].getId() == id) {
                pinakas[i] = null;
            }
        }
    }

    public ArchiveItem oldestItem() {
        int min = 2030;
        ArchiveItem oldestArch = null;

        for (int i = 0; i < pinakas.length; i++) {
            if(pinakas[i] instanceof ArchiveItem) {
                ArchiveItem item = (ArchiveItem) pinakas[i];
                if(min > item.getYear()) {
                    min = item.getYear();
                    oldestArch = item;
                }
            }
        }

        return oldestArch;
    }

    public int totalPages() {
        int sum = 0;

        for (int i = 0; i < pinakas.length; i++) {
            if(pinakas[i] instanceof Book) {
                sum += ((Book) pinakas[i]).getPages();
            }
        }

        return sum;
    }
}
