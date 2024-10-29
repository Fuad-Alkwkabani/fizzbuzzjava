package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    private final FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    void testNumeroDivisiblePor3() {
        assertEquals("Fizz", fizzBuzz.checkNumbre(3));
        assertEquals("Fizz", fizzBuzz.checkNumbre(6));
    }

    @Test
    void testNumeroDivisiblePor5() {
        assertEquals("Buzz", fizzBuzz.checkNumbre(5));
        assertEquals("Buzz", fizzBuzz.checkNumbre(10));
    }

    @Test
    void testNumeroDivisiblePor3Y5() {
        assertEquals("FizzBuzz", fizzBuzz.checkNumbre(15));
        assertEquals("FizzBuzz", fizzBuzz.checkNumbre(30));
    }

    @Test
    void testNumeroNoDivisiblePor3Ni5() {
        assertEquals("1", fizzBuzz.checkNumbre(1));
        assertEquals("2", fizzBuzz.checkNumbre(2));
    }
}
