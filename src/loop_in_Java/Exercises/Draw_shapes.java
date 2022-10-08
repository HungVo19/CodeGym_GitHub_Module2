//package src.loop_in_Java.Exercises;
//
//import java.util.Scanner;
//
//public class Draw_shapes {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int choice=-1;
//
//        do {
//            System.out.println("Menu");
//            System.out.println("1. Print the rectangle");
//            System.out.println("2. Print the square triangle");
//            System.out.println("3. Print isosceles triangle");
//            System.out.println("0. Exit");
//            System.out.println("Enter your choice:");
//
//            choice = input.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.println("Enter length");
//                    int rows = input.nextInt();
//
//                    System.out.println("Enter width");
//                    int cols = input.nextInt();
//
//                    for (int i = 0; i < rows; i++) {
//                        for (int j = 0; j < cols; j++) {
//                            System.out.print("* ");
//                        }
//                        System.out.println();
//                    }
//                    break;
//                case 2:
//                    System.out.println("1. bottom -left");
//                    System.out.println("2. top -left");
//                    System.out.println("3. bottom -right");
//                    System.out.println("4. top -right");
//                    System.out.println("Enter your choice:");
//                    choice = input.nextInt();
//                    switch (choice) {
//                        case 1:
//                            System.out.println("Enter rows");
//                            rows = input.nextInt();
//
//                            for (int i = 1; i <= rows; i++) {
//                                for (int j = 0; j < i; j++) {
//                                    System.out.print("* ");
//                                }
//                                System.out.println();
//                            }
//                        case 2:
//                            System.out.println("Enter rows");
//                            rows = input.nextInt();
//
//                            for (int i = 1; i <= rows; i++) {
//                                for (int j = rows; j >= i; j--) {
//                                    System.out.print("* ");
//                                }
//                                System.out.print("\n");
//                            };
//                            break;
//                        case 3:
//                            System.out.println("Enter rows");
//                            rows = input.nextInt();
//
//                            for (int i = 1; i <= rows; i++){
//                                for(int j = rows -1; j>=i; j--){
//                                    System.out.print(" ");
//                                }
//                                for(int k = 1; k <= i; k++){
//                                    System.out.print("*");
//                                }
//                                System.out.println();
//                            }
//                        case 4:
//                            System.out.println("Enter rows");
//                            rows = input.nextInt();
//
//                            for (int i = 1; i <= rows; i++){
//                                for(int j = rows; j>=i; j--){
//                                    System.out.print("*");
//                                }
//                                for(int k = 0; k <= i; k++){
//                                    System.out.print(" ");
//                                }
//                                System.out.println();
//                            }
//                    }
//                case 3:
//                    System.out.println("Enter rows");
//                    rows = input.nextInt();
//
//                    for (int i = 1; i <= rows; i++){
//                        for(int j = rows -1; j>=i; j--){
//                            System.out.print(" ");
//                        }
//                        for(int k = 1; k <= i; k++){
//                            System.out.print("*");
//                        }
//                        if(i>=2){
//                            for (int g = 2; g<=i;g++){
//                                System.out.print("*");
//                            }
//                        }
//                        System.out.println();
//                    }
//            }
//        }
//        while (choice!=0);
//    }
//}
