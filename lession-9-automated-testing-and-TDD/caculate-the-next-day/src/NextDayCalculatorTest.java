import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @org.junit.jupiter.api.Test
    void findNextDay1() {
        int day = 18;
        int month = 10;
        int year = 2023;
        int[] expected = new int[]{19, 10, 2023};

        int[] result = NextDayCalculator.nextDay(day, month, year);
        assertArrayEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void findNextDay2() {
        int day = 28;
        int month = 2;
        int year = 2023;
        int[] expected = new int[]{1, 3, 2023};

        int[] result = NextDayCalculator.nextDay(day, month, year);
        assertArrayEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void findNextDay3() {
        int day = 28;
        int month = 2;
        int year = 2024;
        int[] expected = new int[]{1, 3, 2024};

        int[] result = NextDayCalculator.nextDay(day, month, year);
        assertArrayEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void findNextDay4() {
        int day = 1;
        int month = 1;
        int year = 2018;
        int[] expected = new int[]{2, 1, 2018};

        int[] result = NextDayCalculator.nextDay(day, month, year);
        assertArrayEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void findNextDay5() {
        int day = 31;
        int month = 1;
        int year = 2018;
        int[] expected = new int[]{1, 2, 2018};

        int[] result = NextDayCalculator.nextDay(day, month, year);
        assertArrayEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void findNextDay6() {
        int day = 31;
        int month = 12;
        int year = 2018;
        int[] expected = new int[]{1, 1, 2019};

        int[] result = NextDayCalculator.nextDay(day, month, year);
        assertArrayEquals(expected, result);
    }
}