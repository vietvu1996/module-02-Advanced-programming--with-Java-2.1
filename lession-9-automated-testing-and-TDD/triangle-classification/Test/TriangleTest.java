import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void triangleClassifier1() {
        double side1 = 1;
        double side2 = 1;
        double side3 = 1;

        String expected = "equilateral triangle";
        String result = Triangle.triangleClassifier(side1,side2,side3);
        assertEquals(result,expected);
    }
    @Test
    void triangleClassifier2() {
        double side1 = 2;
        double side2 = 2;
        double side3 = 3;

        String expected = "isosceles triangle";
        String result = Triangle.triangleClassifier(side1,side2,side3);
        assertEquals(result,expected);
    }
    @Test
    void triangleClassifier3() {
        double side1 = 3;
        double side2 = 4;
        double side3 = 5;

        String expected = "Normal Triangle";
        String result = Triangle.triangleClassifier(side1,side2,side3);
        assertEquals(result,expected);
    }
    @Test
    void triangleClassifier4() {
        double side1 = 8;
        double side2 = 2;
        double side3 = 3;

        String expected = "It's not a triangle dude!";
        String result = Triangle.triangleClassifier(side1,side2,side3);
        assertEquals(result,expected);
    }
    @Test
    void triangleClassifier5() {
        double side1 = -1;
        double side2 = 2;
        double side3 = 1;

        String expected = "It's not a triangle dude!";
        String result = Triangle.triangleClassifier(side1,side2,side3);
        assertEquals(result,expected);
    }
    @Test
    void triangleClassifier6() {
        double side1 = 0;
        double side2 = 1;
        double side3 = 1;

        String expected = "It's not a triangle dude!";
        String result = Triangle.triangleClassifier(side1,side2,side3);
        assertEquals(result,expected);
    }
}