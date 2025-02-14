import es.uah.matcomp.mp.e1.Account;
import es.uah.matcomp.mp.e1.Customer;

public class TestMain5 {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Paquito", 'f');
        Customer c2 = new Customer(2, "Emilio", 'm');
        System.out.println(c1.getId());
        System.out.println(c1.getName());
        System.out.println(c1.getGender());
        System.out.println(c1.toString());

        Account a1 = new Account(1, c1, 1690.0);
        Account a2 = new Account(2, c2);
        System.out.println(a1.getBalance());
        System.out.println(a1.getId());
        System.out.println(a1.getCustomer());
        System.out.println(a1.getCustomerName());
        System.out.println(a1.toString());
        a2.setBalance(769.0);
        System.out.println(a2.toString());
        a1.deposit(100.0);
        System.out.println(a1.toString());
        a1.withdraw(99.0);
        System.out.println(a1.toString());
        a2.withdraw(1000.0);
    }
}
