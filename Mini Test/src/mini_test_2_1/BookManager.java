package mini_test_2_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class BookManager {

    private final List <Book> books;

    public BookManager() {
        books = new ArrayList<>();
    }


    public void addBook(Scanner scanner) {
        System.out.println("Enter book data");
        System.out.println("Enter book code:");
        int bookCode = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter book name:");
        String name = scanner.nextLine();
        System.out.println("Enter book price:");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter book author:");
        String author = scanner.nextLine();
        System.out.println("Enter specific type of book you want to add");
        System.out.println("1. Programming book");
        System.out.println("2. Fiction book");
        System.out.println("3. Normal book");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("Programming Book");
                System.out.println("Enter language of book:");
                String language = scanner.nextLine();
                System.out.println("Enter framework");
                String framework = scanner.nextLine();

                ProgrammingBook book = new ProgrammingBook(bookCode, name, price, author, language, framework);
                books.add(book);
                System.out.println("New book is added successfully!");
                break;
            case 2:
                System.out.println("Fiction Book");
                System.out.println("Enter category:");
                String category = scanner.nextLine();

                FictionBook book1 = new FictionBook(bookCode, name, price, author, category);
                books.add(book1);
                System.out.println("New Fiction book is added successfully!");

                break;
            case 3:
                System.out.println("Add normal book");
                Book book2 = new Book(bookCode, name, price, author);
                books.add(book2);
                System.out.println("New Programming book is added successfully!");
                break;
        }
    }

    public void getSumPrice() {
        double sum = 0;
        for (Book book : books) {
            if(book == null){
                break;
            } else {
                sum += book.getPrice();
            }
        }
        System.out.println("Total price of all books are " + sum);
    }

    public void countByLanguage(Scanner scanner) {
        System.out.println("Enter language you want to filter");
        String language = scanner.nextLine();
        int count = 0;
        for (Book book : books) {
            if (book instanceof ProgrammingBook && Objects.equals(((ProgrammingBook) book).getLanguage(), language)) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Cannot find any book with" + language + " language");
        } else {
            System.out.println("Total books which is in " + language + "language are " + count + " books");
        }
    }

    public void countByCategory(Scanner scanner){
        System.out.println("Enter category you want to search:");
        String category = scanner.nextLine();
        int count = 0;
        for (Book book : books) {
            if (book == null) {
                break;
            }
            else if (book instanceof FictionBook && Objects.equals(((FictionBook) book).getCategory(), category)){
                count++;
            }
        }
        if (count == 0){
            System.out.println("Cannot find any book in " + category + " category");
        }
        System.out.println("Total books which is " + category + " are " + count + " books");
    }

    public void countByPrice(Scanner scanner){
        System.out.println("Enter price range you want to search:");
        double price = Double.parseDouble(scanner.nextLine());
        int count = 0;
        for (Book book : books) {
            if(book == null) {
                break;
            }
            else if (book.getPrice() <= price){
                count++;
            }
        }
        if (count == 0){
            System.out.println("Cannot find any book in that price range");
        }
        System.out.println("Total books which have price below " + price + " are " + count + " books");
    }

    public void displayAllBooks(){
        for (Book book : books) {
            if (book == null) {
                break;
            } else {
                if (book instanceof ProgrammingBook) {
                    System.out.println(((ProgrammingBook) book).toStringOfProgrammingBook());
                } else if (book instanceof FictionBook) {
                    System.out.println(((FictionBook) book).toStringOfFictionBook());
                } else {
                    System.out.println(book);
                }
            }
        }
    }
}
