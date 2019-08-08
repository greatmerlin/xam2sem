package FFHS;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;
    private static int count;

    @org.junit.BeforeClass
    public static void beforeClass(){
        System.out.println("This executes before any test cases. Count = " + count++);
    }

    @org.junit.Before
    public void setup(){
        account = new BankAccount("Tim", "Bax", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a Test...");
    }

    @org.junit.Test
    public void deposit() {
         double balance = account.deposit(200, true); // should return 1200.00

        assertEquals(1200.00, balance, 0);

    }

    @org.junit.Test
    public void withdraw() {
        double balance = account.withdraw(600, true);
        assertEquals(400.00,balance,0);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch(){
        account.withdraw(600.00,false);
        fail("should have thrown an Illegal Argument(which should also been caught from 'expected')");
    }

    @org.junit.Test
    public void getBalance_deposit() {
        account.deposit(200, true); // should return 1200.00
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() {
        account.withdraw(200, true); // should return 1200.00
        assertEquals(800.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_True(){
        assertTrue("If it is false, this will be shown",account.isCHECKING());
    }

    @org.junit.AfterClass
    public static void afterClass(){
        System.out.println("This is being executed after all Tests. Count = " + count++);
    }

    @org.junit.After
    public void tearDown(){
        System.out.println("Count = " + count++);
    }

/*    @org.junit.Test
    public void dummyTests(){
        assertEquals(20,21);
    }*/

}

