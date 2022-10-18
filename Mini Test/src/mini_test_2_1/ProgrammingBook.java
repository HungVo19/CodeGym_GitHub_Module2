package mini_test_2_1;

public class ProgrammingBook extends Book {
    private String language;
    private String framework;

    public ProgrammingBook(){}

    public ProgrammingBook(String language, String framework) {
        this.language = language;
        this.framework = framework;
    }

    public ProgrammingBook(int bookCode, String name, double price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public String toStringOfProgrammingBook() {
        return "Programming Book{" +
                "bookCode=" + super.getBookCode() +
                ", name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                ", author='" + super.getAuthor() + '\'' +
                ", language='" + this.language + '\'' +
                ", framework='" + this.framework + '\'' +
                '}';
    }
}
