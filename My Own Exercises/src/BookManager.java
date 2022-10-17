public class BookManager extends Book {
    private Book[] books;
    private static int index = 0;

    public BookManager() {}

    public BookManager(Book[] books) {
        this.books = books;
    }

    public void addBook(String name, double price, int quantity, String publishDate) {
        books[index] = new Book(name, price, quantity, publishDate);
        index ++;
    }

    public void addNonFictionBook(String name, double price, int quantity, String publishDate, String type) {
        books[index] = new NonFictionBook(name, price, quantity, publishDate, type);
        index ++;

    }

    public void addFictionBook(String name, double price, int quantity, String publishDate, String author) {
        books[index] = new FictionBook(name, price, quantity, publishDate, author);
        index ++;
    }

    public void displayAllBooks() {
        for (Book books : books) {
            if (books != null) {
                System.out.println(books);
            }
        }
    }

    public void displayNonFictionBook(){
        for (Book books : books) {
            if (books instanceof NonFictionBook) {
                System.out.println(books);
            }
        }
    }


}
