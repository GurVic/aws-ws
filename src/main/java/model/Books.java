package model;

import java.util.Set;

public class Books {
    private Set<Book> books;

    public Books(Set<Book> books) {
        this.books = books;
    }

    public Books() {
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Books{" +
                "books=" + books +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Books books1 = (Books) o;

        return books != null ? books.equals(books1.books) : books1.books == null;

    }

    @Override
    public int hashCode() {
        return books != null ? books.hashCode() : 0;
    }
}
