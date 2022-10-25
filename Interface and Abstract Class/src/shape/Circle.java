package shape;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    public double getParameter() {
        return Math.PI * this.radius * 2;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + this.radius + ", area = " +getArea()+
                ",which is a subclass of " + super.toString();
    }
}
