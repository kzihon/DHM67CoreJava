package oop.interfaces;

public class C implements A,B{
    @Override
    public void get() {

    }

    @Override
    public void put() {
        A.super.put();
    }
}
