package src;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int value = 6;
        int indexToAdd = 6;

        int[] newArray = new int[array.length+Math.abs(indexToAdd - array.length+1)];
        for (int i =0 ; i < array.length; i++){
            newArray[i] = array[i];
        }
        newArray[newArray.length-1] = value;
        System.out.print(Arrays.toString(newArray));
    }
}
