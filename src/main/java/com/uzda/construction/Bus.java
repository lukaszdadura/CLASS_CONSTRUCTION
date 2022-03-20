package com.uzda.construction;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Bus extends Vehicle {

    private BigDecimal engineCapacity;
    private Fuel fuelType;

    public Bus(Producer producer, LocalDate manufactureDate, boolean isLowFloor, boolean isArticulated, BigDecimal engineCapacity, Fuel fuelType) {
        super(producer, manufactureDate, isLowFloor, isArticulated);

        if (engineCapacity.compareTo(BigDecimal.ZERO) == 1) {
            this.engineCapacity = engineCapacity;
        }
        this.fuelType = fuelType;
    }

    public BigDecimal getEngineCapacity() {
        return engineCapacity;
    }

    public Fuel getFuelType() {
        return fuelType;
    }
}
