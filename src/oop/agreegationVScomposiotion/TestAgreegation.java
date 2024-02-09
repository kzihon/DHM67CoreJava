package oop.agreegationVScomposiotion;

public class TestAgreegation {
    public static void main(String[] args) {
        Engine e = new Engine(12,500);
        Car c= new Car("AAA", 245000.8f,e);
        c=null;// i am release the reference of c but e is still in the memory
        System.gc();
        System.out.println(e);
        System.out.println(c);
    }
}
