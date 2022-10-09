package src.arrays_and_method.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class find_max_in_two_dimensional_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Create 2D array:");
            System.out.println("0. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    int[][] array = createTwoDimensionalArray();
                    System.out.println("Your 2D array is " + Arrays.deepToString(array));

                    System.out.println("Max value in above array is " + findMaxValueIn2DArray(array));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }

    static int[][] createTwoDimensionalArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rows number");
        int rows = input.nextInt();
        System.out.println("Enter columns number ");
        int cols = input.nextInt();
        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter value  at index " + "[" + i + "]"
                        + "[" + j + "]");
                array[i][j] = input.nextInt();
            }
        }
        return array;
    }

    static int findMaxValueIn2DArray(int[][] array) {
        int maxValue = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (maxValue < array[i][j]) {
                    maxValue = array[i][j];
                }
            }
        }
        return maxValue;
    }
}
