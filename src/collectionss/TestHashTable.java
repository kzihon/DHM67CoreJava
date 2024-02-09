package collectionss;

import java.util.*;

public class TestHashTable {
    public static void main(String[] args) {
        Map m=new Hashtable();//only difference with hashmap is hashtable is syncronized// two threads can't update it at the same time
        Map map = new TreeMap();//SAME WITH TreeSet m=by here it's key value pair. and sorted based on ascending key of map elememts
        m.put("ID",23);
        m.put("Name","chan");
        m.put("age",45);
        m.put("Name","li");//name here will override the first name which holds the chan
        System.out.println(m);
        m.remove("Age");
        System.out.println("m after removal: "+m);
        //merge another map
        Map m1=new Hashtable();
        m1.put("ID1",25);
        m1.put("Name1", "kiii");
        m1.put("Age1",89);
        //merge operation
        m.putAll(m1);
        System.out.println("m after merge with m1: "+m);
        System.out.println("m1 after merge with m: "+m1);
        //map is iterable?//No
        //can we make it iterable using any built-in? yes
        //there are three implemtetation of map by which we can convert into set
        //1.key set
        //2.valueSet
        //3.EntrySet

        //1.keySet
//        Set s1=m.keySet();
//        Iterator it=s1.iterator();
//        while (it.hasNext()){
//            Object o=it.next();
//            System.out.println(o+" : " );
//            System.out.println(m.get(o));
//        }
//        //2. EntrySet
//        Set s1=m.entrySet();
//        Iterator it=s1.iterator();
//        while (it.hasNext()){
//           // Object o=it.next();
//          //  System.out.println(o+"\t" );
//            Map.Entry o=(Map.Entry)it.next();
//            System.out.print(o.getKey()+"\t");
//            System.out.print(o.getValue()+"\t");
//}

//values
        Collection c=m.values();
        Iterator it=c.iterator();
        while (it.hasNext()){
            // Object o=it.next();
            //  System.out.println(o+"\t" );
            Object o=it.next();
            System.out.print(o+"\t");

        }
    }
}
