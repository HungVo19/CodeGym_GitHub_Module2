import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = new int[] {12,4,6,98,34,3,7,6,3,100};

        for ( int i = 0; i < list.length; i++) {
            for ( int j = list.length -1; j >i ; j--){
                if (list[j] < list[j-1]) {
                    int temp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(list));
        System.out.println("------------");

        int min;
        for ( int i = 0 ; i < list.length; i++) {
            min = i;
            for (int j = i+1; j < list.length; j++) {
                if (list[j] > list[i]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = list[min];
                list[min] = list[i];
                list[i] = temp;
            }
        }
        System.out.println(Arrays.toString(list));
        System.out.println("-----------------");

        int pos, x;
        for (int i =1; i < list.length; i++) {
            x = list[i];
            pos = i;
            while (( pos > 0 && x < list[pos-1])) {
                list[pos] = list[pos-1];
                pos --;
            }
            list[pos] =x;
        }
        System.out.println(Arrays.toString(list));
    }
}