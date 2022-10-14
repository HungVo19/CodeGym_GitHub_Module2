package fan;

import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Fan fan1 = new Fan(3,10,"yellow", true);
        Fan fan2 = new Fan(2,5,"blue", false);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

    }
}
