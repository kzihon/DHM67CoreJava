package oop.abstracts;

public class Manager extends Employee{


    public Manager(){

    }

    public Manager(String name, int age, String department, double salary){
        super(name,age,department,salary);

    }
    @Override
    public void job() {
        System.out.println("Job ===> Manager");
        System.out.println("Department = "+ super.getDepartment());
    }
}
