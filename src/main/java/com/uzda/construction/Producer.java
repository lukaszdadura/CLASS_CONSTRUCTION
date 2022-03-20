package com.uzda.construction;

import static com.uzda.construction.Util.*;

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
}
