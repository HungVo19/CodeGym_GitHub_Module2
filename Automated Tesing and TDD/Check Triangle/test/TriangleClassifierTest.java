import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    @DisplayName("Test Possible Triangle")
    void checkCase1() {
        int a = 0;
        int b = 1;
        int c = 1;

        String expected = "Triangle is not available!";
        String result = TriangleClassifier.classifyTriangle(a,b,c);

        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test Possible Triangle")
    void checkCase2() {
        int a = -1;
        int b = 2;
        int c = 1;

        String expected = "Triangle is not available";
        String result = TriangleClassifier.classifyTriangle(a,b,c);

        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test Possible Triangle")
    void checkCase3() {
        int a = 8;
        int b = 2;
        int c = 3;

        String expected = "Triangle is not available!";
        String result = TriangleClassifier.classifyTriangle(a,b,c);

        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test equilateral Triangle")
    void checkCase4() {
        int a = 2;
        int b = 2;
        int c = 2;

        String expected = "This is an equilateral triangle";
        String result = TriangleClassifier.classifyTriangle(a,b,c);

        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test isolated Triangle")
    void checkCase5() {
        int a = 2;
        int b = 2;
        int c = 3;

        String expected = "This is an isolated triangle";
        String result = TriangleClassifier.classifyTriangle(a,b,c);

        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test if a normal Triangle")
    void checkCase6() {
        int a = 3;
        int b = 4;
        int c = 5;

        String expected = "This is a normal triangle";
        String result = TriangleClassifier.classifyTriangle(a,b,c);

        assertEquals(expected,result);
    }
}