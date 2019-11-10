package com.epam.hw7;
import java.util.Arrays;
import java.util.Comparator;

public class Books {



    public Book[] bookArray = new Book[0];

    public void addBooks(Book newBook){
        bookArray = Arrays.copyOf(bookArray, bookArray.length + 1);
        bookArray[bookArray.length - 1] = newBook;
    }

    @Override
    public String toString() {
        return "Books " +
                "bookArray=" + Arrays.toString(bookArray);
    }

    public void viewAllBooks(){
        for (int i = 0; i < bookArray.length; i++) {
            bookArray[i].toString();
            System.out.println(bookArray[i].toString());

        }

    }
    public void changePrice(double proc){
        double newPrice = 0;
        for (int i = 0; i < bookArray.length; i++) {
            newPrice = bookArray[i].getPrice() + bookArray[i].getPrice() * proc / 100;
            bookArray[i].setPrice(newPrice);
        }
    }
    public Book[] searchAuthor(String searchText){
        Book[] returnBooks = new Book[0];
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i].getAuthor().equals(searchText)){
                returnBooks = Arrays.copyOf(returnBooks, returnBooks.length + 1);
                returnBooks[returnBooks.length - 1] = bookArray[i];
            }
        }
        if (returnBooks.length <= 0) {
            System.out.println("Nothing found!");
        }
        return returnBooks;
    }
    public Book[] searchYear(int finderYear){
        Book[] returnYear = new Book[0];
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i].getYear() > finderYear){
                returnYear = Arrays.copyOf(returnYear, returnYear.length + 1);
                returnYear[returnYear.length - 1] = bookArray[i];
            }
        }
        if (returnYear.length <= 0) {
            System.out.println("Nothing found!");
        }
        return returnYear;
    }
    public Book[] sortByAuthor(){
        Book[] sortedBook = Arrays.copyOf(bookArray, bookArray.length);
        Arrays.sort(sortedBook, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                if (book1 == null){ return -1; }
                if (book1.getAuthor() == null){ return -1; }
                if (book2 == null){ return 1; }
                if (book2.getAuthor() == null){ return 1; }
                if (book1.getAuthor().equals(book2.getAuthor())){ return 0; }
                return book1.getAuthor().compareTo(book2.getAuthor());
            }
        });
        return sortedBook;
    }
    public Book[] sortByEdition(){
        Book[] sortedBook = Arrays.copyOf(bookArray, bookArray.length);
        Arrays.sort(sortedBook, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                if (book1 == null){ return -1; }
                if (book1.getEdition() == null){ return -1; }
                if (book2 == null){ return 1; }
                if (book2.getEdition() == null){ return 1; }
                if (book1.getEdition().equals(book2.getEdition())){ return 0; }
                return book1.getEdition().compareTo(book2.getEdition());
            }
        });
        return sortedBook;
    }
    public Book[] sortByPrice(){
        Book[] sortedBook = Arrays.copyOf(bookArray, bookArray.length);
        Arrays.sort(sortedBook, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                if (book1 == null){ return -1; }
                if (book2 == null){ return 1; }
                if (book1.getPrice() == book2.getPrice()){ return 0; }
                return Double.compare(book1.getPrice(), book2.getPrice());
            }
        });
        return sortedBook;
    }
}