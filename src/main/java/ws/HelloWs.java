package ws;

import model.Book;
import model.Books;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.HashSet;
import java.util.Set;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class HelloWs {


    public String sayHello(String name) {
        if (name == null) {
            return "Hello";
        }

        return "Hello, " + name + "!";
    }

    public Books getBooks() {
        Book book1 = new Book(1,"Valery Sushkov", "Captan Blaack");
        Book book2 = new Book(2,"Illya Seleznov", "Morning Dear");
        Book book3 = new Book(3,"Artem Nagorny", "Gaps quickly");
        Book book4 = new Book(4,"Alexandr Bliznuk", "Go ahead, busters");
        Books books = new Books();
        Set<Book> bookSet = new HashSet<Book>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        return new Books(bookSet);
    }
}
