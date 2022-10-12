package src.inheritance.shape;

public class Circle extends Shape{
    private double radius;

    Circle(){
        radius = 1.0d;
    }

    Circle(double radius){
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return " A Circle with radius = " + radius
                + ", which is a subclass of " + super.toString();
    }
}
