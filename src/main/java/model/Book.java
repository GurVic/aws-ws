package model;

public class Book {
    private int esbn;
    private String author;
    private String title;

    public Book() {
    }

    public Book(int esbn, String author, String title) {
        this.esbn = esbn;
        this.author = author;
        this.title = title;
    }

    public int getEsbn() {
        return esbn;
    }

    public void setEsbn(int esbn) {
        this.esbn = esbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (esbn != book.esbn) return false;
        if (author != null ? !author.equals(book.author) : book.author != null) return false;
        return title != null ? title.equals(book.title) : book.title == null;

    }

    @Override
    public String toString() {
        return "Book{" +
                "esbn=" + esbn +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return esbn;
    }
}
