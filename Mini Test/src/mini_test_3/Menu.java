package mini_test_3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Menu {
    public static void main(String[] args) {
        Category electronics = new Category("electronics");
        Category computers = new Category("computers");
        Category smartHome = new Category("smart home");


        Scanner scanner = new Scanner(System.in);

        ProductManager productManager = new ProductManager();

        do {
            System.out.println("Menu");
            System.out.println("1. Display products ");
            System.out.println("2. Add new products");
            System.out.println("3. Update product by Id");
            System.out.println("4. Calculation");
            System.out.println("0. Exit");
            String choice = "";
            Matcher matcher;
            do {
                System.out.println("Enter your choice");
                choice = scanner.nextLine();
                Pattern pattern = Pattern.compile("^[01234]$");
                matcher = pattern.matcher(choice);
                if (!matcher.matches()) {
                    System.out.println("Wrong input. Try again!");
                }
            } while (!matcher.matches());

            switch (Integer.parseInt(choice)){
                case 1:
                    System.out.println("Hello");
                    break;
                case 2:
                        System.out.println("Byebye");
                        break;
                case 0:
                    System.exit(0);
            }

        } while (true);
    }
}
