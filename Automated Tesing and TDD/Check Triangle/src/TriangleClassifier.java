public class TriangleClassifier {
    public static String classifyTriangle(int a, int b, int c) {
        boolean sideIsNegativeValue = a <= 0 || b <= 0 || c <= 0;
        boolean possibleTriangle = a + b < c || a + c < b || b + c < a;
        boolean threeSidesAreEqual = a == b && b == c;
        boolean twoOfThreeSidesAreEqual = a == b || b == c || a == c;

        if (sideIsNegativeValue || possibleTriangle) {
            return "Triangle is not available!";
        } else {
            if (threeSidesAreEqual) {
                return "This is an equilateral triangle";
            } else {
                if (twoOfThreeSidesAreEqual) {
                    return "This is an isolated triangle";
                }
            }
        }
        return "This is a normal triangle";
    }
}

