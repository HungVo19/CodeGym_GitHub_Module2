package practice_using_ArrayList_LinkedList;

import comparable_and_comparator.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManagerUsingArrayList {
    private ArrayList<Product> products;

    public  ProductManagerUsingArrayList() {
        products = new ArrayList<>();
    }

    public ProductManagerUsingArrayList(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }



    public void add (Scanner scanner) {
        System.out.println("New Product data:");
        System.out.println("Id:");
        String id = scanner.nextLine();
        System.out.println("Name");
        String name = scanner.nextLine();
        System.out.println("Cost");
        double cost = Double.parseDouble(scanner.nextLine());
        products.add(new Product(id, name, cost));
    }

    public void editById (Scanner scanner) {
        System.out.println("Enter id of product");
        String id = scanner.nextLine();

        int index = getIndexByID(id);

        System.out.println("Update id");
        String newId = scanner.nextLine();
        System.out.println("Update name");
        String name = scanner.nextLine();
        System.out.println("Update cost");
        double cost = Double.parseDouble(scanner.nextLine());
        products.get(index).setId(newId);
        products.get(index).setName(name);
        products.get(index).setCost(cost);
    }

    public void removeByID (Scanner scanner) {
        System.out.println("Enter id of product");
        String id = scanner.nextLine();

        int index = getIndexByID(id);

        products.remove(index);

    }

    private int getIndexByID(String id) {
        int index = -1;
        for (int i=0; i < products.size(); i++) {
            if(products.get(i).getId().equals(id)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println(id + " Id is not found!");
        }
        return index;
    }

    public void display () {
        for (Product p: products) {
            System.out.println(p);
        }
    }

    public Product searchByName(Scanner scanner) {
        System.out.println("Enter name to search");
        String name = scanner.nextLine();
        int index = -1;
        for (int i=0; i < products.size(); i++) {
            if(products.get(i).getId().equals(name)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println(name + " Name is not found!");
        }
        return products.get(index);
    }

    public void sortByCost (){
        CostAscending costAscending = new CostAscending();
        CostDescending costDescending = new CostDescending();
        Collections.sort(this.getProducts(), costAscending);
        System.out.println("Ascending by Cost:");
        for(Product p: products){
            System.out.println(p);
        }

        Collections.sort(this.getProducts(), costDescending);
        System.out.println("Descending by Cost:");
        for(Product p: products){
            System.out.println(p);
        }
    }

}
