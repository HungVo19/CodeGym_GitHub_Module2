public class FictionBook extends Book {
    private String type;

    public FictionBook() {
    }

    public FictionBook(String name, double price, int quantity, String publishDate, String type) {
        super(name, price, quantity, publishDate);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", kind of book = " + type;
    }
}
