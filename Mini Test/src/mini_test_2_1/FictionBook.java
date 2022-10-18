package mini_test_2_1;

public class FictionBook extends Book{
    private String category;

    public FictionBook(){}

    public FictionBook(String category) {
        this.category = category;
    }

    public FictionBook(int bookCode, String name, double price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String toStringOfFictionBook() {
        return "Fiction Book{" +
                "bookCode=" + super.getBookCode() +
                ", name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                ", author='" + super.getAuthor() + '\'' +
                ", language='" + this.category + '\'' +
                '}';
    }
}
