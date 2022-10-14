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

    public Square() {
    }

    public Square(double size){
        super(size,size);
    }

    public Square(String color, boolean filled, double side ) {
        super(color, filled, side, side);
    }

    public double getSide(){
        return getLength();
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setLength(double size) {
        super.setLength(size);
    }

    @Override
    public void setWidth(double size) {
        super.setWidth(size);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", area = "+
                getArea()
                + ", which is a subclass of "
                + super.toString();    }
}
