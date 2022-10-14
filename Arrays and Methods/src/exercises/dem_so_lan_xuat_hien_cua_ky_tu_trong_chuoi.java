package exercises;

import java.util.Scanner;

public class dem_so_lan_xuat_hien_cua_ky_tu_trong_chuoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Enter you string :");
            String str = input.nextLine();

            String strLowerCase = str.toLowerCase();

            System.out.println("Enter the character you want to check:");
            char character = input.next().charAt(0);

            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (character == strLowerCase.charAt(i)) {
                    count++;
                }
            }
            System.out.println("The character " + "'"+ character +"'" + " appears " + count + " times");
    }
}
