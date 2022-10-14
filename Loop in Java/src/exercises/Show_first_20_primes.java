package exercises;


import java.util.Scanner;

public class Show_first_20_primes {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int inputNumber;
        do {
            System.out.println("Enter the number of primes you want to print:");
            inputNumber = input.nextInt();

            int count = 0;
            int number = 2;
            while (count < inputNumber) {
                boolean flag = true;
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(number);
                    count++;
                }
                number++;
            }
        }while (true);

    }
}
