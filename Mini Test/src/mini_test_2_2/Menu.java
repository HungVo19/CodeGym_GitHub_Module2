package mini_test_2_2;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MaterialManager materialManager = new MaterialManager();


        do {
            System.out.println("Menu");
            System.out.println("1. Display all material ");
            System.out.println("2. Add material");
            System.out.println("3. Remove material");
            System.out.println("4. Update material");
            System.out.println("5. Get real price");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    materialManager.display();
                    break;
                case 2:
                    int choice1;
                    do {
                        System.out.println("Choose type of material to add");
                        System.out.println("1. Meat");
                        System.out.println("2. Crispy Flour");
                        System.out.println("0. Exit");
                        choice1 = Integer.parseInt(scanner.nextLine());
                        if (choice1 == 0) {
                            break;
                        }
                        materialManager.addMaterial(choice1, scanner);
                    } while (true);
                    break;
                case 3:
                    int choice2;
                    if (materialManager.getMaterial().isEmpty()) {
                        System.out.println("The list is EMPTY now!");
                    } else {
                        do {
                            System.out.println("Choose option as below");
                            System.out.println("1. Remove all");
                            System.out.println("2. Remove by Id");
                            System.out.println("3. Remove by Name");
                            System.out.println("4. Remove by Index");
                            System.out.println("0. Exit");
                            choice2 = Integer.parseInt(scanner.nextLine());
                            if (choice2 == 0) {
                                break;
                            }
                            materialManager.remove(choice2, scanner);
                        } while (true);
                    }
                    break;
                case 4:
                    int choice3;
                    if (materialManager.getMaterial().isEmpty()) {
                        System.out.println("The list is EMPTY now!");
                    } else {
                        do {
                            System.out.println("Choose option as below");
                            System.out.println("1. Update");
                            System.out.println("0. Exit");
                            choice3 = Integer.parseInt(scanner.nextLine());
                            if (choice3 == 0) {
                                break;
                            } else {
                                materialManager.update(choice3, scanner);
                            }
                        } while (true);
                    }
                    break;
                case 5:
                    if (materialManager.getMaterial().isEmpty()) {
                        System.out.println("The list is EMPTY now!");
                    } else {
                        materialManager.getRealMoney();
                    }
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
}
