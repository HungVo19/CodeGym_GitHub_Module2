package src.inheritance.point_and_moveablepoint;

public class Main {
    public static void main(String[] args) {
        Point unknownPoint = new Point(20,30);
        System.out.println(unknownPoint.toString());
        unknownPoint.setXY(10,20);
        System.out.println(unknownPoint.toString());
        unknownPoint = new MoveablePoint(unknownPoint.getX(),
                unknownPoint.getY(),
                10,
                20);
        System.out.println(unknownPoint.toString());
        ((MoveablePoint) unknownPoint).move();
        System.out.println(unknownPoint.toString());
        MoveablePoint anotherPoint = new MoveablePoint(20,20);
        System.out.println(anotherPoint.toString());
        anotherPoint.move();
        System.out.println(anotherPoint.toString());
    }
}
