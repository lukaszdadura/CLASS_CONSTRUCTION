package com.uzda.construction.model;

import static com.uzda.construction.util.ConstructionUtil.*;

public class Producer {

    private String name;
    private Address address;
    private String nipNumber;
    private String phoneNumber;

    public Producer(String name, Address address, String nipNumber, String phoneNumber) {
        if (isInputValid(name)) {
            this.name = name;
        }
        if (address != null) {
            this.address = address;
        }
        if (isInputValid(nipNumber) && isNipNumberValid(nipNumber)) {
            this.nipNumber = nipNumber;
        }
        if (isInputValid(phoneNumber) && isPhoneNumberValid(phoneNumber)) {
            this.phoneNumber = phoneNumber;
        }
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getNipNumber() {
        return nipNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
