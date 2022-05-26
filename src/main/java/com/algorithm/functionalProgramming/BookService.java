package com.algorithm.functionalProgramming;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
    /*
   (Book o1, Book o2) ->  o2.getName().compareTo(o1.getName());
     */

    List<Book> getBookInSort(){
      List<Book> books =  new BookDAO().getBookList();
        Collections.sort(books, (Book o1, Book o2) ->  o2.getName().compareTo(o1.getName()));
      return books;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBookInSort());
    }
}

//class MyComparator implements Comparator<Book> {
//
//
//    @Override
//    public int compare(Book o1, Book o2) {
//        return o2.getName().compareTo(o1.getName());
//    }
//}