package src.interface_and_abstract_class.exercises.interface_resizable;

import src.inheritance.shape.Circle;
import src.interface_and_abstract_class.exercises.interface_resizable.Resizable;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public void resize(double percent) {
        this.setRadius(this.getRadius()*percent/100);
    }
}
