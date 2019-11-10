package com.epam.hw7;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Books library = new Books();
        library.addBooks(new Book(1, "Alice in Wonderland", "Carroll", "Wordsworth", 2018, 160, 202.3));
        library.addBooks(new Book(2, "The Lord of the Rings", "Tolkien", "Hasper", 2014, 1358, 1950.5));
        library.addBooks(new Book(3, "Tom Sawyer", "Mark Twain", "Belford", 1976, 342, 125.5));
        library.addBooks(new Book(4, "The Hobbit", "Tolkien", "Hasper", 1937, 390, 320));
        library.addBooks(new Book(5, "Harry Potter", "J. Rolling", "Bloomsbury", 2014, 332, 415.8));
        library.addBooks(new Book(6, "The Great Gatsby", "F. Scott Fitzgerald", "Wordsworth", 1992, 144, 78.2));
        library.addBooks(new Book(7, "The War Prayer", "Mark Twain", "Wordsworth", 1961, 149, 79.8));
        library.addBooks(new Book(8, "Through the Looking-Glass", "Carroll", "Fingerprint", 2019, 156, 148.2));
        library.addBooks(new Book(9, "The Peoples of Middle-earth", "Tolkien", "Hasper", 2010, 512, 345.2));

        library.viewAllBooks();
        System.out.println("Sort By Author: " + Arrays.toString(library.sortByAuthor()));
        System.out.println("Sort By Edition: " + Arrays.toString(library.sortByEdition()));
        System.out.println("Sort By Price: " + Arrays.toString(library.sortByPrice()));
        System.out.println("Enter discount: ");
        Scanner sc = new Scanner(System.in);
        double proc1;
        while (true) {
            proc1 = sc.nextDouble();

            try {
                Validator.validPrice(proc1);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        library.changePrice(proc1);
        library.viewAllBooks();

        System.out.println("Search author: ");
        Scanner sc1 = new Scanner(System.in);
        String searchTxt;
        Books libraryAutor = new Books();
        while (true){
        searchTxt = sc1.nextLine();
        try {
            Validator.validAuthor(searchTxt);
            break;
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        }

        libraryAutor.bookArray = library.searchAuthor(searchTxt);
        libraryAutor.viewAllBooks();

        System.out.println("Search year: ");
        Books libraryYears = new Books();
        int searchYears;
        Scanner sc2 = new Scanner(System.in);
        while (true) {
            searchYears = sc2.nextInt();
            try {

                Validator.validYear(searchYears);
                break;
            }catch (InputMismatchException e) {
                System.out.println("Wrong input type!");
            }catch (Exception e) {
                System.out.println(e);
            }
        }
            libraryYears.bookArray = library.searchYear(searchYears);
            libraryYears.viewAllBooks();


    }
}

