package com.ems.pojo_concepts.PojoTocomplexJson.bookstorePojo;

import java.util.List;

public class BookMagazineStoreData {
    private List<Book> books;
    private List<Magazine> magazines;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Magazine> getMagazines() {
        return magazines;
    }

    public void setMagazines(List<Magazine> magazines) {
        this.magazines = magazines;
    }
}
