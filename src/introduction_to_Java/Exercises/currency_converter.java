package src.loop_in_Java.Exercises;

import java.util.Scanner;

public class currency_converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1. USD to VND converter");
            System.out.println("2. VND to USD converter");
            System.out.println("3. Exit");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Amount:");
                    double usd = input.nextDouble();
                    double vnd = usd * 23000;
                    System.out.println(usd + " USD equals " + vnd + " VND");
                    break;
                case 2:
                    System.out.println("Amount:");
                    double vnd1 = input.nextDouble();
                    double usd1 = vnd1/ 23000;
                    System.out.println(vnd1 + " VND equals " + usd1 + " USD");
                    break;
                case 3:
                    System.exit(0);
            }
        } while (true);
    }
}
