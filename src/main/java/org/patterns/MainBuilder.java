package org.patterns;

public class MainBuilder {
    public static void main(String[] args) {
        Book book = (new BookBuilder()).setAuthor("Dumitru Cojuhari")
                .setTitle("Teodor si aventura spre cheia magica")
                .setISBN("9785885542999")
                .setPrice(199)
                .setPublisher("Tipografia Centrala")
                .setVolume(1)
                .createBook();



        System.out.println("The author " + book.getAuthor() + " of the book " + '"' + book.getTitle() + '"' + " having "
                + book.getISBN() + " which costs " + book.getPrice() + "RON" + " published by " + book.getPublisher()
                + " Volume " + book.getVolume());
    }
}
