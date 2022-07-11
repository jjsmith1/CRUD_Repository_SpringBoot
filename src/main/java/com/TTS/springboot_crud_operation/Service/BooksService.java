package com.TTS.springboot_crud_operation.Service;

import com.TTS.springboot_crud_operation.Model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {
    @Autowired
    BooksRespository booksRespository;
    public List<Books> getAllBooks(){
        List<Books> books = new ArrayList <Books> ();
        booksRespository.findAll().forEac(books1 -> books.add(books1));
        return books;
    }
    public Books getBooksById(int id){
        return booksRespository.findById(id).get();
    }
    public void saveOrUpdate(Books books){
        booksRespository.save(books);
    }
    public void delete(int id){
        booksRespository.deletById(id);
    }
    public void update(Books books,int bookid){
        booksRepository.save(books);
    }

    public void saveOnUpdate(Books books) {
    }
}
