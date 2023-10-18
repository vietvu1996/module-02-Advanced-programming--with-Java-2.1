import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzToWordTest {
    @Test
    void convertNumbersToWord1() {
        int number = 53 ;
        String expected = "BuzzFizz";
        assertEquals(expected,fizzBuzz.convertNumbersToWord(53));
    }
    @Test
    void convertNumbersToWord2() {
        int number = 30 ;
        String expected = "Fizzzero";
        assertEquals(expected,fizzBuzz.convertNumbersToWord(30));
    }
    @Test
    void convertNumbersToWord3() {
        int number = 26 ;
        String expected = "twosix";
        assertEquals(expected,fizzBuzz.convertNumbersToWord(26));
    }
    @Test
    void convertNumbersToWord4() {
        int number = 3 ;
        String expected = "Fizz";
        assertEquals(expected,fizzBuzz.convertNumbersToWord(3));
    }
    @Test
    void convertNumbersToWord5() {
        int number = 5 ;
        String expected = "Buzz";
        assertEquals(expected,fizzBuzz.convertNumbersToWord(5));
    }
}