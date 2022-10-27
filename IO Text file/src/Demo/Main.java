package Demo;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("IO Binary and Serialization/src/Demo/fileInput.txt");
        file.createNewFile();
    }
}
