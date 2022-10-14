package exercises;

import src.inheritance.shape.Shape;
import src.inheritance.shape.Square;
import exercises.interface_coloroble.HowToColorSquare;
import exercises.interface_resizable.ResizableCircle;
import exercises.interface_resizable.ResizeableRectangle;
import exercises.interface_resizable.ResizeableSquare;

public class Main {
     public static void main(String[] args) {
          System.out.println("----- Test Interface Resizeable-----");

          Shape[] shapes = new Shape[4];
          shapes[0] = new ResizableCircle("red", true, 4.5);
          shapes[1] = new ResizeableRectangle("blue", false, 6.7, 3.2);
          shapes[2] = new ResizeableSquare("grey", false, 5.5);
          shapes[3] = new HowToColorSquare();

          for(Shape shape: shapes){
               System.out.println(shape);
          }
          System.out.println("----------");
          for(Shape shape: shapes){
               if(shape instanceof ResizableCircle){
                    ((ResizableCircle) shape).resize((int)(Math.random()*100));
               }
               if (shape instanceof ResizeableRectangle){
                    ((ResizeableRectangle)shape).resize((int)(Math.random()*100));
               }
               if (shape instanceof ResizeableSquare){
                    ((ResizeableSquare)shape).resize((int)(Math.random()*100));
               }
               if(shape instanceof HowToColorSquare){
                    ((HowToColorSquare) shape).howToColor();
               }
               System.out.println(shape);
          }
     }
}
