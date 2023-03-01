package org.example;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate {
    // private Book[] books;
    private List<Book> books;
    // private int last = 0;

    public BookShelf(int maxSize) {
        // this.books = new Book[maxSize];
        this.books = new ArrayList<>(maxSize);
    }

    public Book getBookAt(int index) {
        // return books[index];
        return books.get(index);
    }

    public void appendBook(Book book) {
        // this.books[last] = book;
        this.books.add(book);
        // last++;
    }

    public int getLength() {
        return books.size();
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
