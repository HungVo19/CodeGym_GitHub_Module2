package src.arrays_and_method;

import java.util.Scanner;

public class find_min_in_element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = {31.4, 50.9, 20.3, 344.233,98.55, 123.45};
        int index = minValue(array);
        System.out.println("The smallest element in the array is: " + array[index]);
    }

    public static int minValue(double[] array){
        int index = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < array[index]){
                index = i;
            }
        }
        return index;
    }
}
