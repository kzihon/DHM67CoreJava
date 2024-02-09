package oop.interfaces;

public class Stu {
    private String name;
    private int age;
    private  double salary;
    private static int count;

    public Stu(){
        count++;
    }

    public Stu(String name, int age, double salary) {
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
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finilize object");
    }





}
