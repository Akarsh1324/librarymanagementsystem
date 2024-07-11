package com.example.library.service;

import com.example.library.model.Book;
import com.example.library.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    public BookServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSaveBook() {
        Book book = new Book();
        book.setTitle("Test Book");
        when(bookRepository.save(book)).thenReturn(book);

        Book result = bookService.saveBook(book);
        assertEquals("Test Book", result.getTitle());
        verify(bookRepository, times(1)).save(book);
    }

    @Test
    public void testGetBookById() {
        Book book = new Book();
        book.setId(1L);
        when(bookRepository.findById(1L)).thenReturn(Optional.of(book));

        Optional<Book> result = bookService.getBookById(1L);
        assertEquals(1L, result.get().getId());
        verify(bookRepository, times(1)).findById(1L);
    }
}
