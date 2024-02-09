package java8;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class Test {
    @FunctionalInterface
    interface Add{
        //user defined functional interface

        void add(int x,int y);
    }
    public static void main(String[] args) {
       Add ob= (x,y)->System.out.println(x+y);
       ob.add(9,8);

       int[]arr={18,39,48,0,9};
        Arrays.stream(arr).filter((x)->x%2==0).forEach(System.out::println);
        IntPredicate p=(x)->x%2==0;
        IntPredicate p1=new IntPredicate() {
            @Override
            public boolean test(int x) {
                if(x%2==0){
                    return true;
                }else return false;

            }
        };
        Arrays.stream(arr).filter(p).forEach(System.out::println);
    }
}
