package Point_2D_and_3D.circle_and_cylinder;

public class Cylinder extends Circle {
    private double height;

    Cylinder(){

    }

    Cylinder(double height) {
        this.height = height;
    }

    Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    double getHeight() {
        return height;
    }

    void setHeight(double height) {
        this.height = height;
    }

    double getVolume(){
        return super.getArea() * Math.PI;
    }

    @Override
    public String toString() {
        return "A Cylinder with " + getRadius() + ", height is " + getHeight()+ ", and color is" + getColor();
    }
}
