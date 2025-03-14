package com.ems.deserializer.getter_setter_pages;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GetterSetterBooks {

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

    // Inner classes for Book and Magazine
    public static class Book {
        private String isbn;
        private Integer price; // Price can be either Integer or String.
        private Integer edition;
        private String title;
        private List<Author> authors;
        private String remark;

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

        public Integer getEdition() {
            return edition;
        }

        public void setEdition(Integer edition) {
            this.edition = edition;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<Author> getAuthors() {
            return authors;
        }

        public void setAuthors(List<Author> authors) {
            this.authors = authors;
        }
        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        // Inner class for Author
        public static class Author {
            @JsonProperty("first_name")
            private String firstName;
            @JsonProperty("last_name")
            private String lastName;

            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }
        }
    }

    public static class Magazine {
        private String title;
        private String month;
        private Integer year;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public Integer getYear() {
            return year;
        }

        public void setYear(Integer year) {
            this.year = year;
        }
    }

}