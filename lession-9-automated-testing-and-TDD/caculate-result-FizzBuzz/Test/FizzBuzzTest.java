import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    @Test
    void firstBuzzTranslate1() {
        int number = 15;
        String expected = "FizzBuzz";

        String result = fizzBuzz.fizzBuzzTranslate(number);
        assertEquals(result, expected);
    }
    @Test
    void firstBuzzTranslate2() {
        int number = 3;
        String expected = "Fizz";

        String result = fizzBuzz.fizzBuzzTranslate(number);
        assertEquals(result, expected);
    }
    @Test
    void firstBuzzTranslate3() {
        int number = 5;
        String expected = "Buzz";

        String result = fizzBuzz.fizzBuzzTranslate(number);
        assertEquals(result, expected);
    }

    @Test
    void firstBuzzTranslate4() {
        int number = -1;
        String expected = "This is not a positive Integer";

        String result = fizzBuzz.fizzBuzzTranslate(number);
        assertEquals(result, expected);
    }

    @Test
    void firstBuzzTranslate5() {
        int number = 2;
        String expected = "2";

        String result = fizzBuzz.fizzBuzzTranslate(number);
        assertEquals(result, expected);
    }
}
