package read_and_write_object;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("IO Binary and Serialization/src/read_and_write_object/product.txt"));
            Product product = new Product(1, "IPhone 12", 2800000, "New");
            Product product1 = new Product(2, "IPhone 13", 2900000, "New1");
            oos.writeObject(product);
            oos.writeObject(product1);
            oos.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            oos.close();
        }
        System.out.println("Success!");
    }
}
