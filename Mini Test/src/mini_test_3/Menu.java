package mini_test_3;

import java.util.Scanner;

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
            Integer choice = new Integer(-1);
            boolean checkChoiceInput = false;
            do {

                try {
                    System.out.println("Enter your choice:");
                    choice = Integer.parseInt(scanner.nextLine());
                    checkChoiceInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Wrong input type. Try again!");
                }

            } while (!checkChoiceInput);

            switch (choice) {
                case 1:
                    productManager.display();
                    break;
                case 2:
                    productManager.add(scanner);
                    break;
                case 3:
                    productManager.updateById(scanner);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
}
