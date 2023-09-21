package com.mycompany.javaaqa.service;

import com.mycompany.javaaqa.domain.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    List<Book> getAllBooks();
}
