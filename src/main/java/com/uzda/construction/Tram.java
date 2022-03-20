package com.uzda.construction;

import java.time.LocalDate;

public class Tram extends Vehicle {

    public Tram(Producer producer, LocalDate manufactureDate, boolean isLowFloor, boolean isArticulated) {
        super(producer, manufactureDate, isLowFloor, isArticulated);
    }
}
