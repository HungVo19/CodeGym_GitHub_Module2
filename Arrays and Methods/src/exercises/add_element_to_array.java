package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class add_element_to_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            int[] originalArray = creatOriginalArray();
            System.out.println("The original array is " + Arrays.toString(originalArray));

            System.out.println("Enter value that you want to add:");
            int valueToAdd = input.nextInt();
            System.out.println("Enter the position you want add that value to array ");
            int indexToAdd = input.nextInt();

            System.out.println("New array is " + Arrays.toString(createNewArray(originalArray, valueToAdd, indexToAdd)));
        } while (true);
    }

    static int[] creatOriginalArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element at index " + i + " :");
            array[i] = input.nextInt();
        }
        return array;
    }

    public static int[] createNewArray(int[] array, int value, int indexToAdd) {
        int[] newArray = {};
        if (indexToAdd < 0) {
            newArray = new int[array.length + Math.abs(indexToAdd)];
            newArray[0] = value;
//            for (int i = 1; i < Math.abs(indexToAdd); i++) {
//                newArray[i] = 0;
//            }
            for (int i = Math.abs(indexToAdd), j = 0; i < newArray.length && j < array.length; i++, j++) {
                newArray[i] = array[j];
            }
        } else if (indexToAdd < array.length) {
            newArray = new int[array.length + 1];
            for (int i = 0; i < indexToAdd; i++) {
                newArray[i] = array[i];
            }
            newArray[indexToAdd] = value;
            for (int i = indexToAdd + 1; i < newArray.length; i++) {
                newArray[i] = array[i - 1];
            }
        } else {
            newArray = new int[array.length + Math.abs(indexToAdd - array.length + 1)];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            newArray[newArray.length - 1] = value;
        }
        return newArray;
    }
}


