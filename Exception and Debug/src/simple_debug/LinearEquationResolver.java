package simple_debug;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Linear Equation Resolver");
        System.out.println("a * x + b = o, find x:");

        System.out.print("a: ");
        double a = Double.parseDouble(scanner.next());

        System.out.print("b: ");
        double b = Double.parseDouble(scanner.next());

        if( a != 0) {
            double solution = -b/a;
            System.out.printf("The solution is: %f!", solution);
        } else {
            if (b == 0) {
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution!");
            }
        }
    }
}
