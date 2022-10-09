package src.arrays_and_method.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class calculate_sum_of_main_diagonal_elements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array = createTwoDimensionalArray();
        System.out.println("Your created square matrix is " + Arrays.deepToString(array));

        int sum = 0;
        for (int i = 0, j = 0 ; i < array.length && j <array[i].length ; i++, j++){
            if (i == j){
                sum += array[i][j];
            }
        }
        System.out.println("The sum of the main diagonal elements is " + sum);
    }

    static int[][] createTwoDimensionalArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Create a square matrix:");
        System.out.println("Enter number");
        int number = input.nextInt();

        int[][] array = new int[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.println("Enter value  at index " + "[" + i + "]" + "[" + j + "]");
                array[i][j] = input.nextInt();
            }
        }
        return array;
    }
}
