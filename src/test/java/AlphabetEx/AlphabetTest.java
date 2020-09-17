package AlphabetEx;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlphabetTest {

    Alphabet a;

    @BeforeEach
    void setUp() {
        a = new Alphabet();
    }

    @Test
    void numberOfVowels() {
        assertEquals(3, a.numberOfVowels("Hej med dig"));
    }

    @Test
    void numberOfConsonants() {
        assertEquals(6, a.numberOfConsonants("Hej med dig"));
    }
}