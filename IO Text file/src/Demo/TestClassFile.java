package Demo;
import java.io.*;
import java.util.Date;

public class TestClassFile {
    public static void main(String[] args) {
       File file = new File("IO Text file/src/Demo/Hello.txt");
        System.out.println("Does it exits: " +file.exists());
        System.out.println("The file has: " + file.length() + " bytes");
        System.out.println("Can it be read: " + file.canRead());
        System.out.println("Can it be written: " + file.canWrite());
        System.out.println("Is it a directory: " + file.isDirectory());
        System.out.println("Is it a file: " + file.isFile());
        System.out.println("Is it absolute: " + file.isAbsolute());
        System.out.println("Is it hidden: " + file.isHidden());
        System.out.println("Absolute path is: " + file.getAbsolutePath());
        System.out.println("Last modified on: " + new Date(file.lastModified()));
    }
}
