package com.example.q4.controller;

import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.q4.model.Book;
@RestController
public class BookController {
    Date a =new Date();
    @GetMapping("/book")
    public Book getMethodName() 
    {
        Book p = new Book("The Great Soldier", "G.Gyan", a);
        return p;
    }
}
