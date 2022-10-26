import java.io.CharArrayReader;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        String obj = "abcdef";
//        int length = obj.length();
//        char c[] = new char[length];
//        obj.getChars(0, length, c, 0);
//        CharArrayReader input1 = new CharArrayReader(c);
//        CharArrayReader input2 = new CharArrayReader(c, 0, 3);
//        int i;
//        try {
//            while ((i = input2.read()) != -1) {
//                System.out.print((char) i);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        char[] chars = new char[]{'a', 'b', 'c', 'd'};

        CharArrayReader charArrayReader = new CharArrayReader(chars);
        int value = charArrayReader.read(chars, 0, 2);
        System.out.println(value);
    }
}