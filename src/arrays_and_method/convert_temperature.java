package src.arrays_and_method;

import java.util.Scanner;

public class convert_temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do{
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit ");
            System.out.println("0. Exit");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Celsius is: " + fahrenheitToCelsius(fahrenheit) + " °F");
                    break;
                case 2:
                    System.out.println("Enter celsius");
                    celsius = input.nextDouble();
                    System.out.println("Fahrenheit is: " + celsiusToFahrenheit(celsius) + " °C");
                    break;
            }

        } while (true);


    }

    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

}
