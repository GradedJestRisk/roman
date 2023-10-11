package roman;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RomanTest {
    @Test void given1ShouldReturnI() {
        // given
        Roman roman = new Roman();
        Integer i = 1;

        // when
        String value = roman.decimalToRoman(i);

        // then
        assertEquals(value,"I");
    }
}
