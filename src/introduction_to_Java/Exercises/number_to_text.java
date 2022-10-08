package src.introduction_to_Java.Exercises;

import java.util.Scanner;

public class number_to_text {
    public static void main(String[] args) {
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your number:");
            int number = input.nextInt();

            if (number >= 0 && number < 10) {
                switch (number) {
                    case 0:
                        System.out.println("zero");
                        break;
                    case 1:
                        System.out.println("one");
                        break;
                    case 2:
                        System.out.println("two");
                        break;
                    case 3:
                        System.out.println("three");
                        break;
                    case 4:
                        System.out.println("four");
                        break;
                    case 5:
                        System.out.println("five");
                        break;
                    case 6:
                        System.out.println("six");
                        break;
                    case 7:
                        System.out.println("seven");
                        break;
                    case 8:
                        System.out.println("eight");
                        break;
                    case 9:
                        System.out.println("nine");
                        break;
                }
            } else if (number >= 10 && number < 20) {
                switch (number) {
                    case 10:
                        System.out.println("ten");
                        break;
                    case 11:
                        System.out.println("eleven");
                        break;
                    case 12:
                        System.out.println("twelve");
                        break;
                    case 13:
                        System.out.println("thirteen");
                        break;
                    case 14:
                        System.out.println("fourteen");
                        break;
                    case 15:
                        System.out.println("fifteen");
                        break;
                    case 16:
                        System.out.println("sixteen");
                        break;
                    case 17:
                        System.out.println("seventeen");
                        break;
                    case 18:
                        System.out.println("eighteen");
                        break;
                    case 19:
                        System.out.println("nineteen");
                        break;
                }
            } else if (number >= 20 && number <= 99) {
                int digit1 = number % 10;
                int digit2 = number / 10;
                String digit1S = "";
                String digit2S = "";
                switch (digit1) {
                    case 1:
                        digit1S = "one";
                        break;
                    case 2:
                        digit1S = "two";
                        break;
                    case 3:
                        digit1S = "three";
                        break;
                    case 4:
                        digit1S = "four";
                        break;
                    case 5:
                        digit1S = "five";
                        break;
                    case 6:
                        digit1S = "six";
                        break;
                    case 7:
                        digit1S = "seven";
                        break;
                    case 8:
                        digit1S = "eight";
                        break;
                    case 9:
                        digit1S = "nine";
                        break;
                }
                switch (digit2) {
                    case 2:
                        digit2S = "twenty";
                        break;
                    case 3:
                        digit2S = "thirty";
                        break;
                    case 4:
                        digit2S = "forty";
                        break;
                    case 5:
                        digit2S = "fifty";
                        break;
                    case 6:
                        digit2S = "sixty";
                        break;
                    case 7:
                        digit2S = "seventy";
                        break;
                    case 8:
                        digit2S = "eighty";
                        break;
                    case 9:
                        digit2S = "ninety";
                        break;
                }
                System.out.println(digit2S + " " + digit1S);
            } else if (number >= 100 && number < 999) {
                int digit3 = number / 100;
                int digit2 = (number - (digit3 * 100)) / 10;
                int digit1 = number % 10;
                String digit3s = "";
                String digit2s = " ";
                String digit1s = " ";
                switch (digit3) {
                    case 1:
                        digit3s = "one hundred";
                        break;
                    case 2:
                        digit3s = "two hundred";
                        break;
                    case 3:
                        digit3s = "three hundred";
                        break;
                    case 4:
                        digit3s = "four hundred";
                        break;
                    case 5:
                        digit3s = "five hundred";
                        break;
                    case 6:
                        digit3s = "six hundred";
                        break;
                    case 7:
                        digit3s = "seven hundred";
                        break;
                    case 8:
                        digit3s = "eight hundred";
                        break;
                    case 9:
                        digit3s = "nine hundred";
                        break;
                }
                if (number % 100 >= 10 && number % 100 < 20) {
                    int digit5 = number % 100;
                    switch (digit5) {
                        case 10:
                            digit2s = "ten";
                            break;
                        case 11:
                            digit2s = "eleven";
                            break;
                        case 12:
                            digit2s = "twelve";
                            break;
                        case 13:
                            digit2s = "thirteen";
                            break;
                        case 14:
                            digit2s = "fourteen";
                            break;
                        case 15:
                            digit2s = "fifteen";
                            break;
                        case 16:
                            digit2s = "sixteen";
                            break;
                        case 17:
                            digit2s = "seventeen";
                            break;
                        case 18:
                            digit2s = "eighteen";
                            break;
                        case 19:
                            digit2s = "nineteen";
                            break;
                    }
                    System.out.println(digit3s + " and " + digit2s);
                } else {
                    switch (digit2) {
                        case 1:
                            digit2s = "ten";
                            break;
                        case 2:
                            digit2s = "twenty";
                            break;
                        case 3:
                            digit2s = "thirty";
                            break;
                        case 4:
                            digit2s = "forty";
                            break;
                        case 5:
                            digit2s = "fifty";
                            break;
                        case 6:
                            digit2s = "sixty";
                            break;
                        case 7:
                            digit2s = "seventy";
                            break;
                        case 8:
                            digit2s = "eighty";
                            break;
                        case 9:
                            digit2s = "ninety";
                            break;
                    }
                    switch (digit1) {
                        case 1:
                            digit1s = "one";
                            break;
                        case 2:
                            digit1s = "two";
                            break;
                        case 3:
                            digit1s = "three";
                            break;
                        case 4:
                            digit1s = "four";
                            break;
                        case 5:
                            digit1s = "five";
                            break;
                        case 6:
                            digit1s = "six";
                            break;
                        case 7:
                            digit1s = "seven";
                            break;
                        case 8:
                            digit1s = "eight";
                            break;
                        case 9:
                            digit1s = "nine";
                            break;
                    }
                    if (digit2 == 0 && digit1 == 0) {
                        System.out.println(digit3s);
                    } else if (digit2 != 0 && digit1 == 0) {
                        System.out.println(digit3s + " and " + digit2s);
                    } else if (digit2 == 0) {
                        System.out.println(digit3s + " and " + digit1s);
                    } else {
                        System.out.println(digit3s + " and " + digit2s + " " + digit1s);
                    }
                }
            } else {
                System.out.println("Out of ability!");
            }
        } while (true);
    }
}
