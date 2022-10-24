package illegal_triangle_exception;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
    }

    public void getMsg(String msg) {
        System.out.println(msg);
    }
}
