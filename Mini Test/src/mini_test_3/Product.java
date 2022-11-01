package mini_test_3;

import java.io.Serializable;

public class Product implements Serializable {
    private Long id;
    private String name;
    private Double price;
    private Integer quantity;
    Category category;

    public Product(Long id, String name, Double price, Integer quantity, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category.getCategory();
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Double getTotalPrice() {
        return this.price * this.quantity;
    }

    @Override
    public String toString() {
        return "Product {" + this.id + ", " + this.name + ", " + this.price
                + ", " + this.quantity + ", " + this.category + ", " + this.getTotalPrice() + " }";
    }
}
