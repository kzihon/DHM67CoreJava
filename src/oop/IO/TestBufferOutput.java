package oop.IO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferOutput {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("first.txt", true);
        BufferedOutputStream bos= new BufferedOutputStream(fos);
        bos.write('c');//write one by one
        bos.write('k');//what we worte is in temporary memory and it is not visibke in the file outputstream
//until you told me to flush it.
        bos.flush();//write every thing in a single go so in network it is more efficent
    }
}
