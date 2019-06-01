package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    public List<Book> allBooks(){
        return null;
    }

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book){
        return bookService.addBookService(book);
    }

}
