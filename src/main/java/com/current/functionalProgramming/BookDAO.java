package com.current.functionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    public List<Book> getBookList(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(101, "Core Java", 400));
        books.add(new Book(102, "Hibernate", 100));
        books.add(new Book(103, "Spring", 200));
        books.add(new Book(104, "Web Service", 300));

        return books;

    }
}
