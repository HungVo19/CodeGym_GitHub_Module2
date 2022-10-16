import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNextDayTest {

    @Test
    @DisplayName("Test case 1")
    void findNextDayCase1() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "2/1/2018";
        String result = FindNextDay.findNextDay(day,month,year);

        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test case 2")
    void findNextDayCase2() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = "1/2/2018";
        String result = FindNextDay.findNextDay(day,month,year);

        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test case 3")
    void findNextDayCase3() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String expected = "1/5/2018";
        String result = FindNextDay.findNextDay(day,month,year);

        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test case 4")
    void findNextDayCase4() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected = "1/3/2018";
        String result = FindNextDay.findNextDay(day,month,year);

        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test case 5")
    void findNextDayCase5() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected = "1/3/2020";
        String result = FindNextDay.findNextDay(day,month,year);

        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test case 6")
    void findNextDayCase6() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String expected = "1/1/2019";
        String result = FindNextDay.findNextDay(day,month,year);

        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test case 7")
    void indNextDayCase7() {
        int day = 31;
        int month = 11;
        int year = 2018;
        String expected = "Not available!!";
        String result = FindNextDay.findNextDay(day,month,year);

        assertEquals(expected,result);
    }
}