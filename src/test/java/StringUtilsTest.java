import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @Test
    void testCapitalize() {
        String capitalized = StringUtils.capitalize("candy and banana");
        assertEquals("Candy and banana", capitalized);
    }

    @Test
    void testContainsOnly() {
        assertFalse(StringUtils.containsOnly("Banana", "abn"));
    }

    @Test
    void testAbbreviate() {
        String abbreviated = StringUtils.abbreviate("No smoking, eat bananas only!", 23);
        assertEquals("No smoking, eat bana...", abbreviated);
    }

    @Test
    void testDifference() {
        String difference = StringUtils.difference("No smoking, eat bananas only!", "No smoking, eat bounty only!");
        assertEquals("ounty only!", difference);
    }

    @Test
    void testIsAlpha() {
        assertFalse(StringUtils.isAlpha("No smoking!"));
    }

    @Test
    void testIsAlphanumeric() {
        assertFalse(StringUtils.isAlphanumeric("No smoking123"));
    }

    @Test
    void testIsNumeric() {
        assertTrue(StringUtils.isNumeric("12398"));
    }

    @Test
    void testIsEmptyEmpty() {
        assertTrue(StringUtils.isEmpty(""));
    }

    @Test
    void testIsEmptyNull() {
        assertTrue(StringUtils.isEmpty(null));
    }

    @Test
    void testIsEmptyNotEmpty() {
        assertFalse(StringUtils.isEmpty(" "));
    }
}
