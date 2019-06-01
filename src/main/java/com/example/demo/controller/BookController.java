package com.example.demo.controller;

import com.example.demo.entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @GetMapping("/all")
    public List<Book> allBooks(){
        return null;
    }
}
