package collectionss;

import java.util.SortedSet;
import java.util.TreeSet;

public class Customer {
    SortedSet<Account> accounts;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer(String name) {
        this.name = name;
        accounts = new TreeSet<>();
    }

    public void addAccount(Account account){
        this.accounts.add(account);
    }
    public SortedSet<Account> getAllAccount(){
        return this.accounts;
    }

}
