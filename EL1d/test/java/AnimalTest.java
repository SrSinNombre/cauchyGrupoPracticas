import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnimalTest {
    private Animal animal;

    // Clase concreta para pruebas
    private class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }

        @Override
        public void greets() {
            System.out.println("Woof!");
        }
    }

    @BeforeEach
    public void setUp() {
        animal = new Dog("Buddy");
    }

    @Test
    public void testGreets() {
        animal.greets(); // Esto imprimirá "Woof!" en la consola
    }
}