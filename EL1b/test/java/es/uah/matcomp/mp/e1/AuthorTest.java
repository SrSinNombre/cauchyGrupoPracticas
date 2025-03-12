package es.uah.matcomp.mp.e1;

import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.*;

public class AuthorTest extends TestCase {
    public static void main(String[] args) {
        Author a1 = new Author("Nigga", "Nigga@hotmail.com", 'f');
        a1.getName();
        a1.getEmail();
        a1.getGender();
        a1.setEmail("nigga1@hotmail.com");
    }
}