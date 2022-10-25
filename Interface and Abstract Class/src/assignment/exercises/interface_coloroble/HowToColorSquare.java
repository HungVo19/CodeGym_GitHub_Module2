package assignment.exercises.interface_coloroble;


import shape.Square;

public class HowToColorSquare extends Square implements Colorable {
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
