package src.arrays_and_method;

import src.arrays_and_method.exercises.remove_element_in_array;

import java.util.Arrays;
import java.util.Scanner;

public class dem_so_luong_sinh_vien_thi_do {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] marks = createOriginalArray();
        System.out.println("Input marks is " + Arrays.toString(marks));
        int count = 0;
        for (int i = 0; i < marks.length; i++){
            if (marks[i] >= 5){
                count++;
            }
        }
        System.out.println("Total number of students passed the exam is " + count + " students");


    }
    static int[] createOriginalArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of students :");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Input marks of student " + (i + 1) + " : ");
            array[i] = input.nextInt();
        }
        return array;
    }
}
