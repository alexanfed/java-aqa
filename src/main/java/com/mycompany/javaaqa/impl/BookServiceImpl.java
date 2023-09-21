package com.mycompany.javaaqa.impl;

import com.mycompany.javaaqa.domain.Book;
import com.mycompany.javaaqa.service.BookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Override
    public List<Book> getAllBooks() {
        List<Book> list = new ArrayList<>();
        Book book = new Book("Some Name", "Some Author");
        list.add(book);
        return list;
    }
}
