package stop_watch1;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        System.out.println(stopWatch.getStartTime() + "hihi");
        stopWatch.start();
        selectionSortAlgorithm();
        stopWatch.stop();
        System.out.println(stopWatch.getEndTime() + "haha");
        System.out.println("Thời gian chạy của phương thức sort là: " + stopWatch.getElapsedTime(1,6));
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


