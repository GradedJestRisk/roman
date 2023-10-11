package roman;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RomanTest {
    @Test void given1ShouldReturnI() {
        // given
        Integer i = 1;

        // when
        String value = Roman.decimalToRoman(i);

        // then
        assertEquals(value,"I");
    }
}
