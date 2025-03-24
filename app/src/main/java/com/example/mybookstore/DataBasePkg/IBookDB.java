package com.example.mybookstore.DataBasePkg;

import java.util.List;

public interface IBookDB {
    String[] getCats();

    List<Book> getBook(String cat);

}
