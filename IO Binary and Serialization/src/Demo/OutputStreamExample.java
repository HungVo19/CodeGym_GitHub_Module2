package Demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("IO Binary and Serialization/src/Demo/output.txt");
        OutputStream os1 = new FileOutputStream("IO Binary and Serialization/src/Demo/output1.txt");

        byte[] bytes = new byte[]{'C', 'o', 'd', 'e', 'G', 'y', 'm'};
        os.write(bytes);
        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            os.write(b);
        }
        os.close();
        os1.write(0);
        os1.write(1);
        os1.write(bytes);
        os1.close();
    }
}
