package Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("IO Binary and Serialization/src/Demo/Codegym.txt");
        int i = -1;
        is.skip(2);
        while ((i = is.read()) != -1) {
            System.out.print((char) i);
        }
        is.close();
    }
}
