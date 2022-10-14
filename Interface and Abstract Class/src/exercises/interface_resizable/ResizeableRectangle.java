package exercises.interface_resizable;

import src.inheritance.shape.Rectangle;

public class ResizeableRectangle extends Rectangle implements Resizable {
    public ResizeableRectangle(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    @Override
    public void resize(double percent) {
        this.setWidth(this.getWidth()*percent/100);
        this.setLength(this.getLength()*percent/100);
    }
}
