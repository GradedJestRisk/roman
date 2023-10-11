package roman;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RomanTest {
    @Test void given1ShouldReturnI() {
        // given
        Integer i = 1;

        // when
        String value = Roman.decimalToRoman(i);

        // then
        assertThat(value).isEqualTo("I");
    }
    @Test void given5ShouldReturnV() {
        // given
        Integer i = 5;

        // when
        String value = Roman.decimalToRoman(i);

        // then
        assertThat(value).isEqualTo("V");
    }
}
