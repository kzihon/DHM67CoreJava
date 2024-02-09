package collectionss;

import java.util.*;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList a= new LinkedList();
        a.add("chan");
        a.add(9);
        a.add(null);
        a.add('k');
        System.out.println(a);
        //insert element at specific index positon
        a.add(1,"lll");
        System.out.println(a);
        //remove by value and index number
        a.remove(new Integer(9));//it works even if it is depreciated and has a red underneath it
        System.out.println(a);
        a.contains(null);//true false
        a.size();
        List a1= new ArrayList();
        a1.add(21);
        a1.add(9);
        a1.add("hi");
        //merge
        a.addAll(a1);
        System.out.println(a);

        //remove all a1 elements form a
        a.removeAll(a1);
        System.out.println(a);

        //retainAll retain all elements of a1 and all elements that are similar to a1 in a

        // a.retainAll(a1);
        System.out.println(a);

        //Iterator is an iterface that allows a collection to be iterated from begining till end.
        //hasNext() check wheather the next element is available in a collection
        //next() return the element from next index
        //Iterable is an interface that implemented by a class to return an iterator
         //Iterator it = a.iterator();
      ListIterator it= a.listIterator();//it is specific for list only and you can iterate forward and backward
        //doubly linked list has a feature of add in the itterator
        //printing list in forward direction
        while (it.hasNext()){
            Object o=it.next();
            if(o instanceof Integer){
                Integer it1=(Integer) o;
            }
            if(o instanceof String){
                String it1=(String) o;
                if(it1.equals("chan")){
                    it.add("pppp");
                    //it.remove();
                }
            }
            System.out.print(o+"\t");

        }
        System.out.println(a);
        while (it.hasPrevious()){
            Object o=it.previous();
            if(o instanceof Integer){
                Integer it1=(Integer) o;
            }
            if(o instanceof String){
                String it1=(String) o;
                if(it1.equals("chan")){
                    it.remove();
                }
            }
            System.out.println();
            System.out.print(o);
        }
        System.out.println(a);



    }
}
