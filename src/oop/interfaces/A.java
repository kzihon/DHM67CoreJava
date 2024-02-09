package oop.interfaces;

public interface A {
    //int i;-> this is not allowed it should be a constant and should be assinged
    int i=45;
    //this is allowee(private) but it is for internal usage only and needs to have a body.
//    private void get() {
//    }
    void get();
    public static void test(){
        System.out.println("under static method A");
    }
    public default void  put(){
        System.out.println("under interface A");
    }
}
