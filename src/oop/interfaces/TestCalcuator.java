package oop.interfaces;

public class TestCalcuator {
    public static void main(String[] args) {
        ICalculator calculator= new Calculator();
        System.out.println(calculator.add(3,3));
        System.out.println(calculator.sub(3,44));
        System.out.println(calculator.mult(2,3));
        System.out.println(calculator.div(3,3));
    }
}
