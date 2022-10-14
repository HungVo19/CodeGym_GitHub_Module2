package shape;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20,10);
        Square square = new Square(10.0);
        System.out.println(rectangle);
        System.out.println(square);

        rectangle.setWidth(30);

        square.setWidth(30);

        System.out.println(rectangle);
        System.out.println(square);
    }
}
