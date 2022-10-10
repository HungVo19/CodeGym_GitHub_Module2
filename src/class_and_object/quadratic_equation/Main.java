package src.class_and_object.quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter a,b,c:");
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();

            QuadraticEquation qe = new QuadraticEquation(a, b, c);

            if (qe.getDiscriminant() == 0) {
                System.out.println("The equation has one root " + qe.getRoot1());
            } else if (qe.getDiscriminant() > 0) {
                System.out.println("The equation has two roots : " + "r1 is " + qe.getRoot1() + ", r2 is  " + qe.getRoot2());
            } else {
                System.out.println("The equation has no root");
            }
        } while (true);

    }
}
