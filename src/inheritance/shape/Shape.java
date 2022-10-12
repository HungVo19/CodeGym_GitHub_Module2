package src.inheritance.shape;

public class Shape {
    String color;
    Boolean filled;

    Shape(){
        this.color = "green";
        this.filled = true;
    }

    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public String toString(){
        return "Demo Shape with color of " + color + "and " + (isFilled()? "filled":"not filled");
    }
}
