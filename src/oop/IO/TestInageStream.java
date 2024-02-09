package oop.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestInageStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fin=new FileInputStream("kidist.jpg");
        FileOutputStream fot= new FileOutputStream("kidist1.jpg");
        int data=0;
        while((data=fin.read())!=-1){
            System.out.println(data+"\t");
            fot.write(data);
        }
    }
}
