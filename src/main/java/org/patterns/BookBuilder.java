package org.patterns;

public class BookBuilder {

    private String title;
    private String author;
    private String ISBN;
    private Integer price;
    private String publisher;
    private Integer volume;

    public String getTitle() {
        return title;
    }
    public BookBuilder setTitle(String title){
        this.title = title;
        return this;
    }
    public BookBuilder setAuthor(String author){
        this.author = author;
        return this;
    }
    public BookBuilder setISBN(String ISBN){
        this.ISBN = ISBN;
        return this;
    }
    public BookBuilder setPrice(Integer price){
        this.price = price;
        return this;
    }
    public BookBuilder setPublisher(String publisher){
        this.publisher = publisher;
        return this;
    }
    public BookBuilder setVolume(Integer volume){
        this.volume = volume;
        return this;
    }

    public Book createBook(){
        Book poem = new Book(title, author, ISBN, price, publisher, volume);
        return poem;
    }
}
