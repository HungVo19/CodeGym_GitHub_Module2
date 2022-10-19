package mini_test_2_1;

import java.util.Scanner;

public class BookManagerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BookManager bookManager = new BookManager();

        int choice;
        do {
            System.out.println("MENU");
            System.out.println("1. Add Book:");
            System.out.println("2. Display all books");
            System.out.println("3. Get total price of all books");
            System.out.println("4. Filter by language:");
            System.out.println("5. Filter by category");
            System.out.println("6. Filter by price");
            System.out.println("0. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    bookManager.addBook(scanner);
                    break;
                case 2:
                    bookManager.displayAllBooks();
                    break;
                case 3:
                    bookManager.getSumPrice();
                    break;
                case 4:
                    bookManager.countByLanguage(scanner);
                    break;
                case 5:
                    bookManager.countByCategory(scanner);
                    break;
                case 6:
                    bookManager.countByPrice(scanner);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
}
