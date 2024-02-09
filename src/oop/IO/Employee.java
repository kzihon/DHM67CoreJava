package oop.IO;

import java.io.Serializable;

public class Employee implements Serializable {// marker interface, nothing to be overriden
    private static final long serialVersionUID=13l;
    transient private String name;
    private int age;
    private  double salary;
    private static int count;

    public Employee(){
        count++;
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void getCount() {
        System.out.printf("Employee Count = %d \n",count);
    }

   public void getEmployee(){
       System.out.println("\nEmployee details:"+"\n"+"Name = "
               +this.name+"\n"+"Age = "+this.age+"\n"+"Salary = "+this.salary);

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
