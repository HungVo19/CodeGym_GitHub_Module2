package array_index_out_of_bound;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();

        Integer[] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any index");
        int x = Integer.parseInt(scanner.nextLine());
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBound");
        }
    }
}
