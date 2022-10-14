package stop_watch;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        StopWatch stopWatch = new StopWatch();
        System.out.println("Start time is " + stopWatch.setStartTime());

        selectionSortAlgorithm();

        System.out.println("End time is " + stopWatch.setStopTime());
        System.out.println("Duration is  " + stopWatch.getElapsedTime() + " seconds");
    }

    public static int[] selectionSortAlgorithm() {
        Scanner input = new Scanner(System.in);
        int[] array = new int[100000];
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            array[i] = random.nextInt(100000);
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
