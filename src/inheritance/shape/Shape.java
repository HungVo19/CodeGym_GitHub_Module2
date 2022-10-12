package src.inheritance.shape;

public class Shape {
    private String color;
    private Boolean filled;

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
        return "A Shape with color of " + color + "and " + (isFilled()? "filled":"not filled");
    }
}
