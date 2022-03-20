package com.uzda.construction;

import static com.uzda.construction.Util.isInputValid;
import static com.uzda.construction.Util.isZipCodeValid;

public class Address {

    private String street;
    private String buildingNumber;
    private String zipCode;
    private String city;
    private String country;

    public Address(String street, String buildingNumber, String zipCode, String city, String country) {
        if (isInputValid(street)) {
            this.street = street;
        }
        if (isInputValid(buildingNumber)) {
            this.buildingNumber = buildingNumber;
        }
        if (isInputValid(zipCode) && isZipCodeValid(zipCode)) {
            this.zipCode = zipCode;
        }
        if (isInputValid(city)) {
            this.city = city;
        }
        if (isInputValid(country)) {
            this.country = country;
        }

    }
}
