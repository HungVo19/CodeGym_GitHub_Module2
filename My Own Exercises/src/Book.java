public class Book {
    private String name;
    private double price;
    private int quantity;
    private String publishDate;

    public Book(){}

    public Book(String name, double price, int quantity, String publishDate) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.publishDate = publishDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "{" + name + ", price: " + ", quantity: " +quantity + ", published date: " +
                publishDate;
    }
}
