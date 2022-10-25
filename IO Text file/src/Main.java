import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("IO Text file/src/demo.txt");

        System.out.println(file.exists());

        File dir = new File("Demo");
        dir.mkdir();
        System.out.println(dir.isDirectory());

        System.out.println(dir.getAbsolutePath());

        dir.delete();
    }
}