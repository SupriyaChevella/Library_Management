package com.demo.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
        Book book1 = new Book("java8", "jamesGossling", "97879727", "programing", 1985, "coding");
        Book book2 = new Book("python", "rossow", "978006112", "coding", 1960, "Literature");
        library.addBook(book1);
        library.addBook(book2);
    }

    @Test
    public void testAddBook() {
        Book newBook = new Book("1983", "George Orwell", "9780451524935", "Fiction", 1949, "Dystopian Literature");
        library.addBook(newBook);

        List<Book> allBooks = library.listAllBooks();
        assertEquals(3, allBooks.size());
    }

    @Test
    public void testRemoveBook() {
        library.removeBook("978006112");

        List<Book> allBooks = library.listAllBooks();
        assertEquals(1, allBooks.size());
    }

    @Test
    public void testFindBookByTitle() {
        List<Book> foundBooks = library.findBookByTitle("java8");

        assertEquals(1, foundBooks.size());
        assertEquals("java8", foundBooks.get(0).getTitle());
    }

    @Test
    public void testFindBookByAuthor() {
        List<Book> foundBooks = library.findBookByAuthor("jamesGossling");

        assertEquals(1, foundBooks.size());
        assertEquals("jamesGossling", foundBooks.get(0).getAuthor());
    }

    @Test
    public void testListAvailableBooks() {
        List<Book> availableBooks = library.listAvailableBooks();

        assertEquals(0, availableBooks.size());
    }
}
