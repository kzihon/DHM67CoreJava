package collectionss;

public class TestAccount {
    public static void main(String[] args) {
        Account a1= new Account("12",799);
        Account a2= new Account("34",898);
        Account a3=new Account("56",1000);

        Customer c1= new Customer("Jack");

        c1.addAccount(a3);
        c1.addAccount(a2);
        c1.addAccount(a1);

        System.out.println(c1.getAllAccount());
    }
}
