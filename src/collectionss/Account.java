package collectionss;

import org.jetbrains.annotations.NotNull;

public class Account implements Comparable<Account>{
    private String id;
    private double balance;

    public Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", balance=" + balance +
                '}';
    }


    @Override
    public int compareTo(@NotNull Account o) {
        if(this.id.compareTo(o.id)>0){
            return 1;
        } else if (this.id.compareTo(o.id)<0) {
            return -1;
        }
        return 0;
    }
}
