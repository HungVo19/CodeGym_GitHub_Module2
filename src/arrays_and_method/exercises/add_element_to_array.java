package src.arrays_and_method.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class add_element_to_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {10, 4, 6, 7, 8, 3, 2, 1, 0};
        int value;
        int index;


        System.out.println("Enter value you want to add:");
        value = input.nextInt();

        do {
            System.out.println("Enter index you want to add:");
            index = input.nextInt();

            if (index <= -1 || index > array.length - 1) {
                System.out.println("That index is out of bound!");
            }
        } while (index <= -1 || index > array.length - 1);

        array[index] = value;

                System.out.printf("\n%-20s%s", "New array is: ", "");
        for (int i =0; i < array.length; i++){
            System.out.print(array[i] + "\t");
        }

//        System.out.println("Enter index you want to add");
//        index = input.nextInt();
//
//        if (index < 0){
//            int size = Math.abs(index) + sourceArray.length;
//            int[] targetArray = new int[size];
//
//            targetArray[0] = value;
//
//            for (int i = 1; i < Math.abs(index); i++){
//                targetArray[i] = 0;
//            }
//
//            for (int i = Math.abs(index); i < targetArray.length; i++){
//                targetArray[i] = sourceArray[i-index-1];
//            }
//
//            System.out.println(Arrays.toString(targetArray));
//            }
        }
    }

