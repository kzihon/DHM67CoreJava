package oop.interfaces;

public class Calculator implements ICalculator{
    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public double sub(double a, double b) {
        return a-b;
    }

    @Override
    public double mult(double a, double b) {
        return a*b;
    }

    @Override
    public double div(double a, double b) {

            return a/b;

    }
}
