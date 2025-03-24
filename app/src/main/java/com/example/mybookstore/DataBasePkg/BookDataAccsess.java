package com.example.mybookstore.DataBasePkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookDataAccsess implements IBookDB {

    List<Book> books = new ArrayList<>();


    public BookDataAccsess() {
        books.add(new Book("1984", 6, "Dystopian", 1));
        books.add(new Book("The Pragmatic Programmer", 4, "Technology", 2));
        books.add(new Book("To Kill a Mockingbird", 9, "Classic", 3));
        books.add(new Book("Data Structures and Algorithms", 5, "Education", 4));
        books.add(new Book("The Hobbit", 7, "Fantasy", 1));

    }

    @Override
    public String[] getCats() {
        String[] cats = {"Dystopian", "Technology", "Classic", "Education", "Fantasy"};
        return cats;
    }

    @Override
    public List<Book> getBook(String cat) {
        List<Book> res = new ArrayList<>();
        for (Book book : books) {
            if (book.getCat().equals(cat))
                res.add(book);
        }

        return res;
    }
}
