package com.app.model;

public class Book {
    private int id;
    private String title;
    private String authors;
    private int price;
    private int stock;

    public Book(int id, String title, String authors, int price, int stock) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.price = price;
        this.stock = stock;
    }

    public Book(Book book) {
        this.id = book.getId();
        this.title = book.getTitle();
        this.authors = book.getAuthors();
        this.price = book.getPrice();
        this.stock = book.getStock();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authors='" + authors + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }

    public double average() {
        return getStock() > 0 ? ((double) getPrice())/getStock() : 0;
    }
}
