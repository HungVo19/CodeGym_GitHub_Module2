package illegal_triangle_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side A");
        double a = scanner.nextInt();
        System.out.println("Enter side B");
        double b = scanner.nextInt();
        System.out.println("Enter side C");
        double c = scanner.nextInt();

        try {
            if (a > 0 && b > 0 && c > 0 && (a + b) > c && (a + c) > b && (b + c) > a) {
                System.out.println("Success");
            } else {
                throw new IllegalTriangleException();
            }
        } catch (IllegalTriangleException i) {
            System.err.println("Not ok");
            i.getMsg("Fail");
        }
    }
}
