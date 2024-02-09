package oop.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr= new FileReader("secont.txt");
        //FileWriter fw= new FileWriter("secont.txt", true);
//        fw.write('A');
//        fw.write(new char[]{'B','C','D'});
//        fw.write("Chandrakant".toCharArray());
//        fw.write("Pendey".toCharArray(),2,3);
//        //i FileWriter, one you wrte uou need to flush
//        fw.flush();
        int c=fr.read();
        System.out.println("c: "+(char)c);
        while ((c=fr.read())!=-1){
            System.out.println((char)c);
        }
    }
}
