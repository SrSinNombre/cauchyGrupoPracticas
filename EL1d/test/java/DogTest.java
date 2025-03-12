
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DogTest {
    private Dog dog;
    private Dog anotherDog;

    @BeforeEach
    public void setUp() {
        dog = new Dog("Buddy");
        anotherDog = new Dog("Max");
    }

    @Test
    public void testGreets() {
        dog.greets(); // Esto imprimirá "Woof" en la consola
    }

    @Test
    public void testGreetsAnotherDog() {
        dog.greets(anotherDog); // Esto imprimirá "Woooof" en la consola
    }
}