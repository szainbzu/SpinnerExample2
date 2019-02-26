package edu.cs.birzeit.spinnerexample.model;

/**
 * Created by Tec on 25-Feb-19.
 */

public class Book {
    private String Isbn;
    private String title;
    private int pages;

    public Book(){}

    public Book(String isbn, String title, int pages) {
        Isbn = isbn;
        this.title = title;
        this.pages = pages;
    }
    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String isbn) {
        Isbn = isbn;
    }

    public String getTitle() {
        return title;
    }



    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }



}
