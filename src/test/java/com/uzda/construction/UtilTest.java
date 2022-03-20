package com.uzda.construction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UtilTest {

    @Test
    void shouldThrowExceptionWhenInputIsEmpty() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Util.isInputValid("");
        });

        String expectedMessage = "The input you have provided is null, empty or blank";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void shouldThrowExceptionWhenInputIsBlank() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Util.isInputValid("  ");
        });

        String expectedMessage = "The input you have provided is null, empty or blank";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void shouldThrowExceptionWhenInputIsNull() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Util.isInputValid(null);
        });

        String expectedMessage = "The input you have provided is null, empty or blank";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void shouldThrowExceptionWhenZipCodeIsInWrongFormat() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Util.isZipCodeValid("111-11");
        });

        String expectedMessage = "The input you have provided is not in 00-000 pattern";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void shouldThrowExceptionWhenPhoneNumberIsTooShort() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Util.isPhoneNumberValid("11111");
        });

        String expectedMessage = "The input you have provided is not in 000000000 pattern";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void shouldThrowExceptionWhenNipNumberIsWithLetters() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Util.isNipNumberValid("11111AAAAA");
        });

        String expectedMessage = "The input you have provided is not in 1111111111 pattern";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}