package es.uah.matcomp.mp.e1;

import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest extends TestCase {
    public static void main(String[] args) {
        Book book = new Book("asdfghjklñ","qwertyuiop",new Author("asdf","asdfg",'m'),10,10);
        book.getIsbn();
        book.getAuthor();
        book.getName();
        book.getPrice();
        book.setPrice(101);
        book.setQty(101);
        book.getAuthorName();
    }

}