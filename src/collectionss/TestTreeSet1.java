package collectionss;

import org.jetbrains.annotations.NotNull;

import java.util.*;
class Employee{// implements Comparable{
    private int id;
    private String name;
    public Employee(){}
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(@NotNull Object o) {
//        Employee e=(Employee) o;
//        if(this.name.compareTo(e.name)>0){
//            return 1;
//        }else if(this.name.compareTo(e.name)<0)
//        return -1;
//        else
//            return 0;
//    }
}
//if employee is comming from 3rd party and doesn't implement comparable interface the way to include comparablility is using comparator like below
class EmployeeComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Employee e1=(Employee) o1;
        Employee e2=(Employee) o2;
        if(e1.getName().compareTo(e2.getName())>0){
            return 1;
        }else if(e1.getName().compareTo(e2.getName())<0)
            return -1;
        else
            return e1.getId()-e1.getId();
    }
}
public class TestTreeSet1 {
    public static void main(String[] args) {
      //  SortedSet a= new TreeSet();  // ensure the object that you are insert into teh treeset should implemet comparable interface
        //if the object that you gonna insert in a treeset has comparator somewhere, you have to tell it like below
        SortedSet a= new TreeSet(new EmployeeComparator());
        Employee e1= new Employee(90, "cha");
        Employee e2= new Employee(80, "cha");
        a.add(e1);
        a.add(e2);
        System.out.println("set a "+ a);


    }
}
