package roman;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class RomanTest {
    @Nested
    @DisplayName("given 1")
    class whenGiven1 {
        @Test
        @DisplayName("should return I")
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
    @DisplayName("given 5")
    class whenGivenV {
        @DisplayName("should return V")
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
