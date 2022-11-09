package Calculator_2.TestCalculator;

import Calculator_2.Converter;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @org.junit.jupiter.api.Test
    void testIsRoman() {
        Converter converter = new Converter();
        /*boolean Roman = true;*/
        boolean b;
        b = converter.isRoman("X");
        assertTrue(b);
    }

    @org.junit.jupiter.api.Test
    void testIntToRoman() {
        String s = "X";
        Converter converter = new Converter();
        assertEquals(s, converter.intToRoman(10));
        //assertEquals(s, converter.intToRoman(5));
    }

    @org.junit.jupiter.api.Test
    void testRomanToInt() {
        Converter converter = new Converter();
        int a = 7;
        assertEquals(a,converter.romanToInt("VII") );
    }
}