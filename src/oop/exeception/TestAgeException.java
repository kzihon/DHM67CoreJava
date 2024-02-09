package oop.exeception;

public class TestAgeException {
    public static void main(String[] args) throws AgeException {//throws AgeException {
        Employee employee=new Employee(1,"emp1",30);
        System.out.println("===================================");
        System.out.println(employee.toString());
        System.out.println("===================================");
        Employee employee1=new Employee(1,"emp1",2);
        System.out.println(employee1.toString());

    }
}
