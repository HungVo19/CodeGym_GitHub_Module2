package Demo;
import java.io.IOException;
import java.io.InputStream;
public class ReadByteConsole {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        while (true){
            System.out.println("Enter 1 char");
            int ch = is.read();
            if (ch == 'q') {
                System.out.println("Finished");
                break;
            }
            is.skip(2);
            System.out.println("Input char is " + (char)ch);
        }
    }
}
