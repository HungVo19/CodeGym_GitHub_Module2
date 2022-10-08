package src.introduction_to_Java.hien_thi_loi_chao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;

        System.out.println("Enter your name below:");
        string = scanner.nextLine();

        System.out.println("Hello: " + string);
    }
}
