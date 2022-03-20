package com.uzda.construction.util;

public class ConstructionUtil {

    public static boolean isInputValid(String userInput) {
        if (userInput == null || userInput.isEmpty() || userInput.trim().isEmpty()) {
            throw new IllegalArgumentException("The input you have provided is null, empty or blank");
        } else {
            return true;
        }
    }

    public static boolean isZipCodeValid(String zipCode) {
        if (!zipCode.matches("[0-9]{2}-[0-9]{3}")) {
            throw new IllegalArgumentException("The input you have provided is not in 00-000 pattern");
        } else {
            return true;
        }
    }

    public static boolean isPhoneNumberValid(String phoneNumber) {
        if (!phoneNumber.matches("[0-9]{9}")) {
            throw new IllegalArgumentException("The input you have provided is not in 000000000 pattern");
        } else {
            return true;
        }
    }

    public static boolean isNipNumberValid(String nipNumber) {
        if (!nipNumber.matches("[0-9]{10}")) {
            throw new IllegalArgumentException("The input you have provided is not in 1111111111 pattern");
        } else {
            return true;
        }
    }
}
