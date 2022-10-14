package assignment;

import java.util.Scanner;

public class great_common_factor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;

        System.out.println("Enter number a: ");
        a = input.nextInt();

        System.out.println("Enter number b: ");
        b = input.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("No common factor");
        } else if (a == b) {
            System.out.println("Two number are the same. Try again!");
        } else {
            int greatestFactor = 1;
            int c= Math.abs(a - b );
            for (int i = 1; i <= c; i++) {
                if (a % i == 0 && b % i == 0 && c % i == 0) {
                    greatestFactor = i;
                }
            }
            System.out.println("The greatest common Factor is " + greatestFactor);
        }
    }
}
