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

    public String getStreet() {
        return street;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
