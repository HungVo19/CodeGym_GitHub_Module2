package Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class InputStreamExample2 {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("IO Binary and Serialization/src/Demo/Codegym.txt");

        byte[] bytes = new byte[6];
        int i = -1;
        while ((i = in.read(bytes)) != -1) {
            String s = new String(bytes,0,i);
            System.out.println(s);
        }
        in.close();
    }
}
