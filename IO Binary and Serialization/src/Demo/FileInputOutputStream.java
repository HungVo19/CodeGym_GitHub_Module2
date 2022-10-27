package Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream output = new FileOutputStream("IO Binary and Serialization/src/Demo/fileOuput.txt");
            for (int i = 0; i < 10; i++) {
                output.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream input = new FileInputStream("IO Binary and Serialization/src/Demo/fileOuput.txt");
            int value;
            while ((value = input.read()) != -1) {
                System.out.print(value + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}