import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("TRIANGLE CLASSIFIER");
            System.out.println("Enter three sides :");

            int a = Integer.parseInt(input.nextLine());
            int b = Integer.parseInt(input.nextLine());
            int c = Integer.parseInt(input.nextLine());

            System.out.println(TriangleClassifier.classifyTriangle(a,b,c));
        } while (true);
    }
}