package exercises;

import java.util.Scanner;

public class Draw_shapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice=-1;

        do {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter length");
                    int rows = input.nextInt();

                    System.out.println("Enter width");
                    int cols = input.nextInt();

                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("1. bottom -left");
                    System.out.println("2. top -left");
                    System.out.println("3. bottom -right");
                    System.out.println("4. top -right");
                    System.out.println("Enter your choice:");
                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Enter number");
                            int number = input.nextInt();

                            for (int i = 0; i < number ; i++) {
                                for (int j = 0; j <=i ; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            System.out.println("Enter number");
                            number = input.nextInt();

                            for (int i = 0; i < number; i++) {
                                for (int j = i; j < number; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case 3:
                            System.out.println("Enter number");
                            number = input.nextInt();

                            for (int i = 0; i < number; i++){
                                for(int j = i; j < number -1; j++){
                                    System.out.print("  ");
                                }
                                for(int k = 0; k <= i; k++){
                                    System.out.print(" *");
                                }
                                System.out.println();
                            }
                            break;
                        case 4:
                            System.out.println("Enter number");
                            number = input.nextInt();

                            for (int i = 0; i < number; i++){
                                for(int j = 0; j <= i; j++){
                                    System.out.print("  ");
                                }
                                for(int k = i; k < number; k++){
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Enter a number");
                    int number = input.nextInt();

                    for (int i =0; i < number; i++){
                        for(int j = i; j < number; j++){
                            System.out.print(" ");
                        }
                        for (int k = 0; k <=i; k++){
                            System.out.print("*");
                        }
                        for (int l = 0; l <= i-1; l++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
            }
        }
        while (choice!=0);
    }
}
