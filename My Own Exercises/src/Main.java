import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = Integer.parseInt(input.nextLine());
        Book[] books = new Book[size];
        BookManager bookManager = new BookManager(books);
        int choice;
        do {
            System.out.println("MENU");
            System.out.println("1. Add normal book");
            System.out.println("2. Add non fiction book");
            System.out.println("3. Add fiction book");
            System.out.println("4. Display all books");
            System.out.println("5. Display all non fiction books");
            System.out.println("Enter your choice :");
            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("name");
                    String name = input.nextLine();
                    System.out.println("price");
                    double price = Double.parseDouble(input.nextLine());
                    System.out.println("quantity");
                    int quantity = Integer.parseInt(input.nextLine());
                    System.out.println("published date");
                    String publishDate = input.nextLine();
                    bookManager.addBook(name, price, quantity, publishDate);
                    break;
                case 2:
                    String name1 = input.nextLine();
                    double price1 = Double.parseDouble(input.nextLine());
                    int quantity1 = Integer.parseInt(input.nextLine());
                    String type = input.nextLine();
                    String publishDate1 = input.nextLine();
                    bookManager.addNonFictionBook(name1, price1, quantity1, publishDate1, type);
                    break;
                case 3:
                    String name2 = input.nextLine();
                    double price2 = Double.parseDouble(input.nextLine());
                    int quantity2 = Integer.parseInt(input.nextLine());
                    String publishDate2 = input.nextLine();
                    String author = input.nextLine();
                    bookManager.addFictionBook(name2, price2, quantity2, publishDate2, author);
                    break;
                case 4:
                    bookManager.displayAllBooks();
                    break;
                case 5:
                    bookManager.displayNonFictionBook();

            }
        } while (true);
    }
}