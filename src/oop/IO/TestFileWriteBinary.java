package oop.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileWriteBinary {
    public static void main(String[] args) throws IOException {
        FileOutputStream file=new FileOutputStream("first.txt");
//        file.write('A');//write a character as a bite
//        file.write('B');
//        file.write('C'); // this is tedous writting characters one by one
       String s= "Jackija";
        file.write(s.getBytes());
     //   file.write(s.getBytes(),3,5);
        file.close();

    }
}
