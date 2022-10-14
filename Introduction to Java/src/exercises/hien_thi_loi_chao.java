package exercises;

import java.util.Scanner;

public class hien_thi_loi_chao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;

        System.out.println("Enter your name below:");
        string = scanner.nextLine();

        System.out.println("Hello: " + string);
    }
}
