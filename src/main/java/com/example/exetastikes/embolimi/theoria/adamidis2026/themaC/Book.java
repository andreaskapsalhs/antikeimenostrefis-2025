package com.example.exetastikes.embolimi.theoria.adamidis2026.themaC;

public class Book extends LibraryItem implements Borrowable {
    private int pages;

    public Book(int pages, String title, String id) throws LathosArithmosSelidwn {
        super(title, id);

        try {
            this.setPages(pages);
        } catch (LathosArithmosSelidwn e) {
            System.out.println(e.getMessage());
            this.setPages(10);
        }
    }

    @Override
    public void borrow() {
        System.out.println("Borrowing item: " + this.title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                '}';
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) throws LathosArithmosSelidwn {
        if(pages < 10 || pages > 200) throw new LathosArithmosSelidwn("Lathos eisodos pages.");
        else this.pages = pages;
    }
}
