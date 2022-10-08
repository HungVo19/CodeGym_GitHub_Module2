package src.arrays_and_method.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class remove_element_in_array {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Create an array first: ");
            int[] array = createOriginalArray();

            int indexToDelete = -1;
            do {
                System.out.println("Enter value you want to delete:");
                int valueToDelete = input.nextInt();

                indexToDelete = findIndex(array, valueToDelete);
                if (indexToDelete == -1) {
                    System.out.println(valueToDelete + " is not found in the array");
                } else {
                    System.out.println("New array is " + Arrays.toString(createNewArray(array, indexToDelete)));
                    break;
                }
            } while (indexToDelete == -1);
        } while (true);
    }

    public static int findIndex(int[] array, int valueToDelete) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (valueToDelete == array[i]) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int[] createNewArray(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        if (index >= 0) System.arraycopy(array, 0, newArray, 0, index);
        if (array.length - (index + 1) >= 0)
            System.arraycopy(array, index + 1, newArray, index + 1 - 1, array.length - (index + 1));
        return newArray;
    }

    public static int[] createOriginalArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input size of array you want to create:");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + " : ");
            array[i] = input.nextInt();
        }
        return array;
    }
}

