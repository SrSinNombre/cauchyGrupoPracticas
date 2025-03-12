
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CatTest {
    private Cat cat;

    @BeforeEach
    public void setUp() {
        cat = new Cat("Whiskers");
    }

    @Test
    public void testGreet() {
        cat.greet(); // Esto imprimirá "Meow" en la consola
    }
}