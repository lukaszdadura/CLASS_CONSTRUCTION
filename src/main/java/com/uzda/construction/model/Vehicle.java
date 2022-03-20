package com.uzda.construction.model;

import java.time.LocalDate;
import java.time.Period;

public abstract class Vehicle {

    private Producer producer;
    private LocalDate manufactureDate;
    private double mileage;
    private boolean isLowFloor;
    private boolean isArticulated;
    private int age;

    public Vehicle(Producer producer, LocalDate manufactureDate, boolean isLowFloor, boolean isArticulated) {
        if (producer != null) {
            this.producer = producer;
        }

        this.manufactureDate = manufactureDate;
        this.isLowFloor = isLowFloor;
        this.isArticulated = isArticulated;
        this.age = calculateAge(manufactureDate);
    }

    private int calculateAge(LocalDate manufactureDate) {
        LocalDate currentDate = LocalDate.now();
        return Period.between(manufactureDate, currentDate).getYears();
    }

    public Producer getProducer() {
        return producer;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public boolean isLowFloor() {
        return isLowFloor;
    }

    public boolean isArticulated() {
        return isArticulated;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "producer=" + producer +
                ", manufactureDate=" + manufactureDate +
                ", mileage=" + mileage +
                ", isLowFloor=" + isLowFloor +
                ", isArticulated=" + isArticulated +
                ", age=" + age +
                '}';
    }
}
