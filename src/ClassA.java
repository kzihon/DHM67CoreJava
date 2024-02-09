public class ClassA {
    public static void main(String[] args) {
        System.out.println(ClassB.X);
    }
}
class ClassB{
    public static final int X;
    static {
            X=10;

        System.out.println("Hello");
    }
}