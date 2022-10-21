package find_longest_string;

import java.util.*;

public class findLongestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your String:");
        String str = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> temp = new LinkedList<>();

            temp.add(str.charAt(i));

            for (int j = i + 1; j < str.length(); j ++) {
                if (str.charAt(j) > temp.getLast()) {
                    temp.add(str.charAt(j));
                }
            }

                if (temp.size() > max.size()){
                    max.clear();
                    max.addAll(temp);
                }
                temp.clear();
        }

        for (Character character : max) {
            System.out.print(character +" ");
        }
    }
}
