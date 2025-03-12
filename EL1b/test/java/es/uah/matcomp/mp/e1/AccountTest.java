package es.uah.matcomp.mp.e1;

import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest extends TestCase {
    public static void main(String[] args) {
        Account a1 = new Account(10,new Customer(10,"Name",'f'), 69 );
        Account a2 = new Account(10,new Customer(10,"Name",'f'));
        a1.getId();
        a1.getCustomer();
        a1.getBalance();
        a1.setBalance(10);
        a1.getCustomerName();
        a1.deposit(10.1);
        a1.withdraw(9.9);

    }

}