package oop.interfaces;

public final class EmployeeImmutable {
    private String name;
    private int age;
    private String address;

    public EmployeeImmutable() {
    }

    public EmployeeImmutable(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "EmployeeImmutable{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
