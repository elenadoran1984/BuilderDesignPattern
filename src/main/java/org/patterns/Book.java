package org.patterns;

public class Book {

    private String title;
    private String author;
    private String ISBN;
    private Integer price;
    private String publisher;
    private Integer volume;

    public Book(String title, String author, String ISBN, Integer price, String publisher, Integer volume) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
        this.publisher = publisher;
        this.volume = volume;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }


}
