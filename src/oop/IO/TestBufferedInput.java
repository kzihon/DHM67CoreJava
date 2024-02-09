package oop.IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestBufferedInput {
    public static void main(String[] args) throws IOException {
        FileInputStream fin= new FileInputStream("first.txt");
        BufferedInputStream bis=new BufferedInputStream(fin);//8 kb
        int data=0;
        int count=0;
        bis.mark(10000);

        while( (data=bis.read())!=-1){
          System.out.println((char)data);
          if(count==3)
              bis.reset();//reaset i want to go to the beginnu=ing when teh counter reach 3
          count++;

      }

    }


}
