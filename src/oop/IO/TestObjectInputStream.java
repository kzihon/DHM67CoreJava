package oop.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectInputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("abc.dat");//b/cc it is aseriablised object we can give it any extention
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        Employee e= new Employee("name",68,6879);
        oos.writeObject(e);
    }
}
