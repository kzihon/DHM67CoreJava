package oop.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestReadBinary {
    public static void main(String[] args) throws IOException {
        FileInputStream fin=new FileInputStream("first.txt");
        //read char by char
//        int value=0;
//        while((value= fin.read())!=-1) {//- is a flag or represents the end of file or input stream
//           // System.out.print(value);//value is aski and cast it into a specigice character
//            System.out.println((char)value);
//        }


        byte[] b =new byte[4];
        fin.read(b,2,2);
        for(byte b1:b){
            System.out.print((char)b1);
        }
    }//returns a character as value as a bite value
}
