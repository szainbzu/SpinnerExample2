package edu.cs.birzeit.spinnerexample.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tec on 25-Feb-19.
 */

public class BookModelMock implements IBookModel {
    private List<Book> books;

    public BookModelMock(){
        books = new ArrayList<>();
        books.add(new Book("12345", "thinking in Java", 235));
        books.add(new Book("67565", "Java Core", 350));
        books.add(new Book("86654", "Professional C#", 500));


    }

    @Override
    public List<Book> getBooks(String item) {
       List<Book> result = new ArrayList<>();
        for(Book book : books){
            if(book.getTitle().contains(item)){
                result.add(book);
            }
        }
        return result;
    }
}
