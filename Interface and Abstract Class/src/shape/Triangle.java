package shape;

public class Triangle extends Shape {
    private double side1 = 1.0d;
    private double side2 = 1.0d;
    private double side3 = 1.0d;

    public Triangle(){}
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter(){
        return (this.side1 + this.side2 + this.side3);
    }

    public double getArea(){
        double s = getPerimeter()/2;
        double area = Math.sqrt(s*(s-this.side1)*(s-this.side2)*(s- this.side3));
        return area;
    }

    @Override
    public String toString() {
        return "This triangle has" +super.getColor() + " color, area = "
                + getArea() + ", and perimeter = " + getPerimeter();
    }
}
