package src.mini_test_1;

public class Product {
    private String name;
    private double price;
    private String description;

    Product() {

    }

    Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void display(){
        System.out.println("Product " + name + ", price is " + price
                            + ", description is " + description);
    }

}
