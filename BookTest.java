package com.demo.library;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BookTest {

    @Test
    public void testBookCreation() {
        Book book = new Book("java8", "jamesGossling", "97879727", "programing", 1985, "coding");

        assertEquals("java8", book.getTitle());
        assertEquals("jamesGossling", book.getAuthor());
        assertEquals("97879727", book.getISBN());
        assertEquals("programing", book.getGenre());
        assertEquals(1985, book.getPublicationYear());
        assertEquals("coding", book.getDepartment());
      
		book.setAvailable(true);
        assertTrue(book.isAvailable());
    }

    @Test
    public void testBookAvailability() {
        Book book = new Book("java8", "jamesGossling", "97879727", "programing", 1985, "coding");

        book.setAvailable(false);
        assertFalse(book.isAvailable());

        book.setAvailable(true);
        assertTrue(book.isAvailable());
    }
}

