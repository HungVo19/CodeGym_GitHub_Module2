package src.arrays_and_method.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class join_two_arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sizeArray1;
        int sizeArray2;

        System.out.println("Enter size of array 1:");
        sizeArray1 = input.nextInt();
        int[] array1 = new int[sizeArray1];
        for( int i = 0; i < sizeArray1; i++){
            System.out.println("Enter element " + (i+1) + "of 1st array:");
            array1[i] = input.nextInt();
        }

        System.out.println("Enter size of array 2:");
        sizeArray2 = input.nextInt();
        int[] array2 = new int[sizeArray2];
        for(int i = 0; i < sizeArray2; i++){
            System.out.println("Enter element " + (i+1) + " of 2nd array:");
            array2[i] = input.nextInt();
        }

        int sizeArray3 = sizeArray1 + sizeArray2;
        int[] array3 = new int[sizeArray3];

        for (int i = 0; i< sizeArray1; i++){
            array3[i] = array1[i];
        }

        for (int i = sizeArray2; i <= sizeArray3; i++){
            array3[i-1] = array2[i-sizeArray2];
        }

        System.out.println("New array is: " + Arrays.toString(array3));
    }
}
