package reverse_elements_in_an_array_using_Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseElements {

    public static void reverseInteger() {
        Stack<Integer> stack = new Stack<>();

        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);

        Stack<Integer> newStack = new Stack<>();
        for (int i = stack.size(); i > 0; i--) {
            newStack.push(stack.pop());
        }
        stack = newStack;
        System.out.println(stack);
    }

    public static void reverseString() {
        Stack<String> strings = new Stack<>();

        strings.push("o");
        strings.push("l");
        strings.push("l");
        strings.push("e");
        strings.push("H");

        Stack<String> newStrings = new Stack<>();
        for (int i = strings.size(); i > 0; i--) {
            newStrings.push(strings.pop());
        }
        System.out.println(newStrings);

    }

    public static void main(String[] args) {
        reverseInteger();
        System.out.println("---------");
        reverseString();
    }

}
