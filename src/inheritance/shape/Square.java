package src.inheritance.shape;

public class Square extends Rectangle {
    public Square(){}

    public Square(double side) {
        super(side, side);
    }
//    public Square(double side , String color, boolean filled) {
//        super(side, color, filled);
//    }

    public double getSide(){
        return getlength();
    }


    public void setSide(double side) {
        super.setWidth(side);
        super.setlength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setlength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

}
