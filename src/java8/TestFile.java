package java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class TestFile {
    public static void main(String[] args) throws IOException {
       // Stream s= Files.lines(Path.of("abc.txt"));
       // s.forEach(System.out::println);//this is method reference, it is an alternative way to substitute the functuional parament in leave of lambda function
       // System.out.println(s.collect(Collectors.toList()));
        //Files.lines(Path.of("abc.txt").

       // String s1= Files.lines(Path.of("abc.txt")).collect(Collectors.joining(" "));
         Files.lines(Path.of("abc.txt")).map(x->x.split(" ")).
                 flatMap(x->Arrays.stream(x)).distinct().forEach(System.out::println);
        //non
       // System.out.println(s1);

//        String s2[]=s1.split(" ");
//        stream(s2).distinct().forEach(System.out::println);
        //map is a function that will do some operation of maping into a stream element(appliying a common logic to all elements in stream)
      /*  Integer array[]=new Integer[]{2,56,87,9};
        ArrayList<Integer>i=new ArrayList<>();
        i.add(1);
        i.add(4);
        i.add(0);
        ArrayList<Integer>j=new ArrayList<>();
        i.add(1);
        i.add(4);
        i.add(0);
        stream(array).map(x->x*x).forEach(x-> System.out.println(x));
        stream(array).map(x->x*x).forEach(System.out::println);
       List list= stream(array).map(x->x*x).collect(Collectors.toList());//I guss Collectores work with object types not primitive types

        Integer a1[]={12,34,56};
        Integer a2[]={18,89,80};

        ArrayList<Integer[]> a3=new ArrayList<Integer[]>();
        a3.add(a1);
        a3.add(a2);
        a3.stream().flatMap(x->Arrays.stream(x)).forEach(System.out::println);
*/
    }
}
