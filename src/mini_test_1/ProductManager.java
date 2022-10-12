package src.mini_test_1;

public class ProductManager {
    Product[] products;

    ProductManager(){
        products = new Product[0];
    }

    public void addProduct(Product product){
        int length = products.length;
        Product[] newProducts = new Product[length+1];
        System.arraycopy(products, 0, newProducts, 0, length);
        newProducts[length] = product;
        this.products = newProducts;
    }

    public void updateNameOfProduct(int index, String name, double price, String description) {
        products[index].setName(name);
        products[index].setPrice(price);
        products[index].setDescription(description);
    }


    public void deleteProduct(int index) {
        if (products.length > 0) {
            Product[] newProducts = new Product[products.length - 1];

            for (int i = 0; i < index; i++) {
                newProducts[i] = products[i];
            }
            for (int i = index; i < newProducts.length; i++) {
                newProducts[i] = products[i + 1];
            }
            this.products = newProducts;
        } else {
            System.out.println("Product list is empty");
        }
    }

    public void displayProducts() {
        if(products.length > 0) {
            for (Product p : products) {
                p.display();
            }
        } else {
            System.out.println("Products list is empty");
        }
    }

    public void displayProductWithIndex(int index){
        products[index].display();
    }


    public void maxPriceProduct() {
        if (products.length > 1) {
            double max = products[0].getPrice();
            int index = -1;
            for (int i = 1; i < products.length; i++) {
                if (products[i].getPrice() > max) {
                    max = products[i].getPrice();
                    index = i;
                }
            }
            System.out.println("Max price is " + max + " of Product " + products[index].getName());
        } else if (products.length == 0){
            System.out.println("Products list is empty");
        } else {
            System.out.println("Product list is only has 1 product!");
        }
    }
}
