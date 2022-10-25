package shape;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter three sides:");
            double side1 = input.nextDouble();
            double side2 = input.nextDouble();
            double side3 = input.nextDouble();
            if (side1 > 0 && side2 > 0 && side3 > 0 && side1 + side2 >= side3 && side1 + side3 >= side2 && side3 + side2 >= side1) {
                Triangle triangle = new Triangle(side1, side2, side3);
                triangle.setColor("red");
                triangle.setFilled(false);
                System.out.println(triangle);
            } else {
                System.out.println("A triangle is impossible!");
            }
        } while (true);
    }
}
