package collectionss;

import oop.interfaces.C;

import java.util.ArrayList;
import java.util.List;

public class CustomerCRUD {
    List<Customer> customers= new ArrayList<>();

    public  void creatCustomer(Customer customer){
        customers.add(customer);
    }
    public void getCustomer(String name){
        int ind=-1;
        for(int i=0;i<customers.size();i++){
            if(customers.get(i).getName().equals(name)){
                ind=i;
            }
        }
       if(ind==-1){
           System.out.println("Customer not found.");
       } else System.out.println(customers.get(ind));
    }
    public void updateCustomer(Customer customer, String name){
        int ind=-1;
        for(int i=0;i<customers.size();i++){
            if(customers.get(i).getName().equals(name)){
                ind=i;
            }
        }
        if(ind!=-1){
            customers.set(ind,customer);
        }

    }
    public void deleteCustomer(String name){
        int ind=-1;
        for(int i=0;i<customers.size();i++){
            if(customers.get(i).getName().equals(name)){
                ind=i;
            }
        }
        if(ind!=-1){
            customers.remove(ind);
        }

    }
}
