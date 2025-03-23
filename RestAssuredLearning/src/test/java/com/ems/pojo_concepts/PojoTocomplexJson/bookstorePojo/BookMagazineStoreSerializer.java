package com.ems.pojo_concepts.PojoTocomplexJson.bookstorePojo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class BookMagazineStoreSerializer {

    private BookMagazineStoreData bookStoreData = new BookMagazineStoreData();

    public void populateMagazinesData() {
        List<Magazine> magazineList = new ArrayList<>();

        Magazine magazine1 = new Magazine();
        magazine1.setTitle("National Geographic");
        magazine1.setMonth("January");
        magazine1.setYear(2009);
        magazineList.add(magazine1);

        Magazine magazine2 = new Magazine();
        magazine2.setTitle("Newsweek");
        magazine2.setMonth("February");
        magazine2.setYear(2009);
        magazineList.add(magazine2);

        bookStoreData.setMagazines(magazineList);
    }

    public void populateBooksData() {
        List<Book> bookList = new ArrayList<>();

        Book book1 = new Book();
        book1.setIsbn("ISBN-0-13-713526-2");
        book1.setPrice(85);
        book1.setEdition(3);
        book1.setTitle("A First Course in Database Systems");

        List<BookAuthor> authorsForBook1 = new ArrayList<>();
        BookAuthor author1 = new BookAuthor();
        author1.setFirstName("Jeffrey");
        author1.setLastName("Ullman");
        authorsForBook1.add(author1);

        BookAuthor author2 = new BookAuthor();
        author2.setFirstName("Jennifer");
        author2.setLastName("Widom");
        authorsForBook1.add(author2);

        book1.setAuthors(authorsForBook1);
        bookList.add(book1);

        Book book2 = new Book();
        book2.setIsbn("ISBN-0-13-815504-6");
        book2.setPrice(100);
        book2.setEdition(2);
        book2.setTitle("Introduction to Algorithms");

        List<BookAuthor> authorsForBook2 = new ArrayList<>();
        BookAuthor author3 = new BookAuthor();
        author3.setFirstName("Thomas");
        author3.setLastName("Cormen");
        authorsForBook2.add(author3);

        BookAuthor author4 = new BookAuthor();
        author4.setFirstName("Charles");
        author4.setLastName("Leiserson");
        authorsForBook2.add(author4);

        book2.setAuthors(authorsForBook2);
        bookList.add(book2);

        bookStoreData.setBooks(bookList);
    }

    public static void main(String[] args) throws JsonProcessingException {
        BookMagazineStoreSerializer serializer = new BookMagazineStoreSerializer();
        serializer.populateMagazinesData();
        serializer.populateBooksData();

        ObjectMapper mapper = new ObjectMapper();
        String jsonOutput = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(serializer.bookStoreData);
        System.out.println(jsonOutput);
    }
}
