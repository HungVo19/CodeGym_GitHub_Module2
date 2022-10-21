package advanced_binary_search;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class AdvancedBinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        do {
            System.out.println("Menu");
            System.out.println("1. Initialize a list of Integer");
            System.out.println("2. Sort the list in ascending order");
            System.out.println("3. Enter value you want to find in the list");
            System.out.println("Enter your choice");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    do{
                    System.out.println("1. Input data");
                    System.out.println("0. Exit");
                    System.out.println("Enter your choice:");
                    int choice1 = Integer.parseInt(scanner.nextLine());
                        switch (choice1) {
                            case 1:
                                int input = Integer.parseInt(scanner.nextLine());
                                list.add(input);
                                break;
                            case 0:
                                System.exit(0);
                        }
                    }while (true);
                case 2:
                    System.out.println(sortedList(list));
                    break;
                case 3:

            }
        } while (true);
    }

    static ArrayList<Integer> sortedList(ArrayList<Integer> list) {
        list.sort(Comparator.naturalOrder());
        return list;
    }

    static int binarySearch(int[] list, int value) {
        int left = 0;
        int right = list.length - 1;
        while (right > left) {
            int mid = (left + right) / 2;
            if (value == list[mid]) {
                return mid;
            } else if (value > list[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    static void display(int[] list, int value) {
        if (binarySearch(list, value) == -1) {
            System.out.println("Not found in the list");
        } else {
            System.out.println(value + "found at index " + binarySearch(list, value));
        }
    }
}
