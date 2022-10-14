package exercises.interface_resizable;

import src.inheritance.shape.Square;

public class ResizeableSquare extends Square implements Resizable {
    public ResizeableSquare(String color, boolean filled, double side) {
        super(color, filled, side);
    }

    @Override
    public void resize(double percent) {
        this.setSide(this.getSide()*percent/100);
    }
}
