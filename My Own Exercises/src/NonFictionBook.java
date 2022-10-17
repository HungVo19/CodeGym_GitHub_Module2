public class NonFictionBook extends Book {
    private String author;

    public NonFictionBook() {
    }

    public NonFictionBook(String name, double price, int quantity, String publishDate, String author) {
        super(name, price, quantity, publishDate);
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString() + ", author = " + author;
    }
}
