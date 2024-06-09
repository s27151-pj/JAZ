package com.example.testexam_1;

public class BookNotFoundException extends RuntimeException {
    BookNotFoundException(Long id) {
        super("Could not find book with id: " + id);
    }
}
