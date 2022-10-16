import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {
    @Test
    @DisplayName("Test case 1")
    void testCase1() {
        int number = -1;

        String expected = "Please enter a positive number";
        String result = FizzBuzzTranslate.numberToString(number);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test case 2")
    void testCase2() {
        int number = 15;

        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.numberToString(number);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test case 3")
    void testCase3() {
        int number = 9;

        String expected = "Fizz";
        String result = FizzBuzzTranslate.numberToString(number);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test case 4")
    void testCase4() {
        int number = 10;

        String expected = "Buzz";
        String result = FizzBuzzTranslate.numberToString(number);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test case 5")
    void testCase5() {
        int number = 30;

        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.numberToString(number);

        assertEquals(expected, result);
    }
}
