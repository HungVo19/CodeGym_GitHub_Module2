import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int date;
        int month;
        int year;
        do {
            System.out.println("Enter date your want to check:");
            date = Integer.parseInt(input.nextLine());
            month = Integer.parseInt(input.nextLine());
            year = Integer.parseInt(input.nextLine());

            System.out.println(FindNextDay.findNextDay(date,month,year));
        }while (true);
    }
}
