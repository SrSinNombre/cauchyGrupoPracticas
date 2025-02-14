//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main_2 {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm'); // Test the constructor
        System.out.println(ahTeck); // Test toString()
        ahTeck.setEmail("paulTan@nowhere.com"); // Test setter
        System.out.println("name is: " + ahTeck.getName()); // Test getter
        System.out.println("eamil is: " + ahTeck.getEmail()); // Test getter
        System.out.println("gender is: " + ahTeck.getGender()); // Test
        Author[] authors = {
                new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm'),
        new Author("Paul Tan", "Paul@nowhere.com", 'm')
        };
// Declare and allocate a Book instance
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy); // toString()
    }
}