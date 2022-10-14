package circle_and_cylinder;

public class Circle {
    private double radius;
    private String color;

    Circle() {
    }

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
    double getArea(){
        return radius * radius * Math.PI;
    }
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with " + getRadius() + ", and color is" + getColor();
    }

}
