package assignment;

import java.util.Scanner;

public class find_max_in_element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size;
        int[] array;

        do{
            System.out.println("Enter a size: ");
            size = input.nextInt();
            if(size > 20){
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);

        array = new int[size];
        for (int i = 0; i < size; i++){
            System.out.println("Enter element" + (i+1) + " is :");
            array[i] = input.nextInt();
        }

        System.out.println("Property list: ");
        for (int j = 0; j < array.length; j++){
            System.out.println(array[j] + "\t");
        }

        int max = array[0];
        int index = 0;
        for(int j = 0; j < size; j++){
            if (array[j] > max){
                max = array[j];
                index = j+1;
            }
        }

        System.out.println("The largest property values in the list is "
                            + max + " at position " + index);
    }
}
