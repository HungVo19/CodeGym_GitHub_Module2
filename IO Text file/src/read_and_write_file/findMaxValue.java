package read_and_write_file;

import java.util.List;
public class findMaxValue {
    public static int findMax (List<Integer> numbers) {
        int max = numbers.get(0); {
            for (int i = 0; i < numbers.size(); i++) {
                if (max < numbers.get(i)) {
                    max = numbers.get(i);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ReadAndWrite readAndWrite = new ReadAndWrite();
        List<Integer> numbers = readAndWrite.readFile("IO Text file/src/read_and_write_file/numbers.txt");
        int maxValue = findMax(numbers);
        System.out.println(maxValue);
        readAndWrite.writeFile("IO Text file/src/read_and_write_file/result.txt", maxValue);
    }
}
