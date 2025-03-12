
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BigDogTest {
    private BigDog bigDog;
    private Dog anotherDog;
    private BigDog anotherBigDog;

    @BeforeEach
    public void setUp() {
        bigDog = new BigDog("Max");
        anotherDog = new Dog("Buddy");
        anotherBigDog = new BigDog("Rocky");
    }

    @Test
    public void testGreets() {
        bigDog.greets(); // Esto imprimirá "Wooow" en la consola
    }

    @Test
    public void testGreetsDog() {
        bigDog.greets(anotherDog); // Esto imprimirá "Wooooow" en la consola
    }

    @Test
    public void testGreetsBigDog() {
        bigDog.greets(anotherBigDog); // Esto imprimirá "Wooooo0oow" en la consola
    }
}