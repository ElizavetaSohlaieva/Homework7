package com.epam.hw7;

import java.util.Arrays;

public class Book {
    private int id;
    private String name;
    private String author;
    private String edition;
    private int year;
    private int pages;
    private double price;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getEdition() {
        return edition;
    }
    public void setEdition(String edition) {
        this.edition = edition;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book: " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", edition='" + edition + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", price=" + price;
    }

    public Book (int id, String name, String author, String edition, int year, int pages, double price){
        this.id = id;
        this.name = name;
        this.author = author;
        this.edition = edition;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }
}
