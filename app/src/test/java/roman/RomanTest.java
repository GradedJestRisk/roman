package roman;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class RomanTest {
    @Nested
    class whenGiven1 {
        @Test
        void shouldReturnI() {
            // given
            Integer i = 1;

            // when
            String value = Roman.decimalToRoman(i);

            // then
            assertThat(value).isEqualTo("I");
        }
    }

    @Nested
    class whenGivenV {
        @Test void shouldReturnV() {
            // given
            Integer i = 5;

            // when
            String value = Roman.decimalToRoman(i);

            // then
            assertThat(value).isEqualTo("V");
        }

    }
}
