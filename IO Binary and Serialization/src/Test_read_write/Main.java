package Test_read_write;

import read_and_write_object.Product;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1,"1",1,"1"));
        products.add(new Product(2,"1",1,"1"));
        products.add(new Product(3,"1",1,"1"));
        products.add(new Product(4,"1",1,"1"));


        File file = new File("src/Test_read_write/product.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("IO Binary and Serialization/src/Test_read_write/product.txt");
            ObjectOutputStream ois = new ObjectOutputStream(fileOutputStream);
            ois.writeObject(products);
            ois.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


//
//        FileInputStream = new FileInputStream("src/Test_read_write/product.txt");
//        ObjectInputStream ois = new ObjectInputStream(fileInputStream);
//        ois.readObject()
    }
}
