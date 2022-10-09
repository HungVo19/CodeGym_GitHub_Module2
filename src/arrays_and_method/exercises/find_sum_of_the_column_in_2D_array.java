package src.arrays_and_method.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class find_sum_of_the_column_in_2D_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do{
            int[][] array = createTwoDimensionalArray();
            System.out.println("Your created array is " + Arrays.deepToString(array));

            int number ;
            do {
                System.out.println("Enter index of columns you want to calculate the sum ");
                number = input.nextInt();
            }while (number < 0 || number > array.length);

            int sum = 0;
            for (int i = 0; i < array.length; i++){
                sum += array[i][number];
            }
            System.out.println("The sum is of the column at index " + number + " is " + sum);

        }while (true);

    }

    static int[][] createTwoDimensionalArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Create a 2D array:");
        System.out.println("Enter rows number");
        int rows = input.nextInt();
        System.out.println("Enter columns number ");
        int cols = input.nextInt();
        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter value  at index " + "[" + i + "]" + "[" + j + "]");
                array[i][j] = input.nextInt();
            }
        }
        return array;
    }
}
