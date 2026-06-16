package com.example.exetastikes.embolimi.theoria.adamidis2025.themaC;

public class ArchiveItem extends LibraryItem {
    private int year;

    public ArchiveItem(String title, String id) {
        super(title, id);
    }

    @Override
    public String toString() {
        return "ArchiveItem{" +
                "year=" + year +
                '}';
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
