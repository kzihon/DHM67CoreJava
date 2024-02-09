package oop.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fin = new FileInputStream("abc.dat");
        ObjectInputStream ois= new ObjectInputStream(fin);
        Employee employee=(Employee) ois.readObject();//Deserialization
        System.out.println(employee.toString());

    }
}
