package src.arrays_and_method.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class remove_element_in_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int[] array = createArray(size);
        System.out.println("Original array is" + Arrays.toString(array));

        int value;

        System.out.println("Enter value you want to delete:");
        value = input.nextInt();

        int index = findIndex(array, value);
        System.out.println("Element that you want to delete is at index " + index);

        if (index == -1) {
            System.out.println(value + " is not found in array");
        } else {
            if (index != array.length - 1) {
                for (int j = index; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
            } else {
                array[array.length - 1] = 0;

            }
            System.out.print(Arrays.toString(array));
        }
    }

    public static int findIndex(int[] array, int value) {
        int index = 0;
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                index = i;
                check = true;
                break;
            }
        }
        if (!check) {
            index = -1;
        }
        return index;
    }

    public static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element at index " + i + " :");
        }
        return array;
    }
}

