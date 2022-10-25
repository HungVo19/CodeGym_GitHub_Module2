package assignment.exercises.interface_resizable;


import shape.Circle;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public void resize(double percent) {
        this.setRadius(this.getRadius()*percent/100);
    }
}
