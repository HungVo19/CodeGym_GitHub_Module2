package assignment.interface_comparable;
import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle("indigo", false, 3.5);

        System.out.println("Pre-sorted:");
        for (ComparableCircle o:circles){
            System.out.println(o);
        }
        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle o : circles) {
            System.out.println(o);
        }
    }
}
