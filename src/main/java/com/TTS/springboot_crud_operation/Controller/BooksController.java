package com.TTS.springboot_crud_operation.Controller;


import com.TTS.springboot_crud_operation.Model.Books;
import com.TTS.springboot_crud_operation.Service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BooksController {
    @Autowired
    BooksService booksService;

    @GetMapping("/book/{bookid}")
    private Books getBooks(@PathVariable("bookid")int bookid) {
        return booksService.getBooksById(bookid);
    }
    @DeleteMapping("/book/{boodid}")
    private void deleteBook(@PathVariable("bookid")int bookid){
        booksService.delete(bookid);
    }
    @PostMapping("/books")
    private int saveBook(@RequestBody Books books){
        booksService.saveOrUpdate(books);
        return books.getBookid();
    }
    @PutMapping("/books")
    private Books update(@RequestBody Books books){
        booksService.saveOnUpdate(books);
        return books;
    }
}
