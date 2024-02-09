package oop.interfaces;

public interface B {
    public default void put(){
        System.out.println("interface b");
    }
    //static methods doesn't inherit, they belong to the interface or the class, you can't overrride them in the implementing class
    public static void test(){
        System.out.println("under static method B");
    }
}
