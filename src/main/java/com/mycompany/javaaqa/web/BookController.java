package com.mycompany.javaaqa.web;

import com.mycompany.javaaqa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/getAllBooks")
    public String getAllBooks() {
        String name = bookService.getAllBooks().get(0).getName();
        String author = bookService.getAllBooks().get(0).getAuthor();

        return "<html>" +
                "<body>" +
                "<p>Name: " + name + "</p>" +
                "<p>Author: " + author + "</p>" +
                "</body>" +
                "</html>";
    }
}
