package com.pluralsight.week5;

import java.time.LocalDate;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private double price;

    public Book(String isbn, String title, String author, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    // methods
    public void applyDiscount(double percentage) {
        this.price = this.price * (1 - percentage/100);
        System.out.println("Discount applied! New price: " + this.price);
    }

    public void applyDiscount(double percentage, LocalDate startDate, LocalDate endDate) {
        if(LocalDate.now().isBefore(endDate) && LocalDate.now().isAfter(startDate)) {
            applyDiscount(percentage);
        }
        System.out.println("Discount not valid!");
    }
}
