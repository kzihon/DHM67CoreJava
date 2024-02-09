package java8;

import java.util.*;

public class TestReduce {
    public static void main(String[] args) {
       // List<Integer> a1= Arrays.asList(23,24,55,44);
       // System.out.println( a1.stream().reduce(0,(x,y)->x+y));

        List<String> name=new ArrayList<>();
        name.add("Chandra");
        name.add("Kant");
        name.add("Panday");

       // System.out.println(name.stream().reduce("",(x,y)->x+y+" "));
        String s[]={"Spring","SpringBoot", "Microservice","Docker","Kubernetes"};
        Arrays.stream(s).sorted().forEach(System.out::println);
        Arrays.stream(s).sorted(Collections.reverseOrder()).forEach(System.out::println);
       // Arrays.stream(s).map(x->x.toUpperCase()).forEach(System.out::println);

        Arrays.stream(s).map(x->{
            int len=x.length();
            return x+": "+len;
        }).forEach(System.out::println);

        Optional<String> max=name.stream().max(String::compareTo);
        List<Integer> a1=Arrays.asList(23,34,3,1,23,22);
        a1.stream().map(x->x+"");


    }
}
