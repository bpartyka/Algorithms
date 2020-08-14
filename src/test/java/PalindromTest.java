import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertTrue;

public class PalindromTest {

    @ParameterizedTest
    @ValueSource(strings = {"Kobyła ma mały bok", "anna", "ann a", "papap", "W W W"})
    public void shouldReturnTrueIfStringIsPalindrome(String text) {

        boolean result = Palindrom.solution(text);
        Assert.assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Kobyła 0ma mały bok", "anaamna", "annna a", "papoppap"})
    public void shouldReturnFalseIfStringIsNotPalindrome(String text) {

        boolean result = Palindrom.solution(text);
        Assert.assertFalse(result);
    }

    @Test
    public void shouldThrownExceptionIfTextIsEmpty() {
        boolean caught = false;
        try {
            Palindrom.solution("");
        } catch (IllegalArgumentException e) {
            caught = true;
        }
        assertTrue(caught);
    }

    @Test
    public void testExpectedException() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Palindrom.solution("");
        });
    }
}
