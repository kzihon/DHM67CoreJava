package collectionss;

import java.util.*;

public class TestTreeSet {
    public static void main(String[] args) {
        SortedSet a= new TreeSet();   //it uses comparator to compare and sort the inputs. so it can't compare the integer with string and others.
        //the objecy inde the treeSet should be all same type(homogenus)
        //they don't allow null value
        //initial capacity of set is 16
        //load-factor=0.75
        a.add("chan");
        a.add("klakd");
       // a.add(null);
        //a.add(null);
        a.add("lll");
        System.out.println(a);
      //  a.remove(null);//removes the null reference
        //a.remove(9);
        if(a.contains("chan")){
            System.out.println("chan is in the set");
        }
        //merge
        List a1 = new ArrayList();
        a1.add("chan");
        a1.add("nm");
        a.addAll(a1);
        System.out.println("add all "+a);
        a.removeAll(a1);
        System.out.println("remove all"+a);
        a.retainAll(a1);// retains all the elements of al
        System.out.println("retain all "+a);
        //insert element at specific index positon
//        a.add(1,"lll"); we don't have indexing so we do't have this feature in set
//        System.out.println(a);

      Iterator it= a.iterator();//it is specific for list only and you can iterate forward and backward
        //printing list in forward direction
        while (it.hasNext()){
            Object o=it.next();
            if(o instanceof Integer){
                Integer it1=(Integer) o;
            }
            if(o instanceof String){
                String it1=(String) o;
                if(it1.equals("chan")){
                    it.remove();
                }
            }
            System.out.print(o);

        }
        System.out.println(a);

    }
}
