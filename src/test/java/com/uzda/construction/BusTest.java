package com.uzda.construction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


class BusTest {

    private Bus defaultBus;

    @BeforeEach
    void setUp() throws Exception {
        defaultBus = new Bus(new Producer("Bus Producer", new Address("Bus street", "26A", "00-000", "Warsaw", "Poland"), "1010101010", "111222333"), LocalDate.of(2020, 01, 01), true, true, BigDecimal.valueOf(6.7), Fuel.HYBRID);
    }

    @Test
    @DisplayName("Getter method for fuel type should work")
    void shouldCheckFuelType() {
        assertEquals(Fuel.HYBRID, defaultBus.getFuelType(), "Fuel type should be hybrid");
    }

    @Test
    @DisplayName("Object shouldn't be created when producer is null")
    void shouldCheckIfProducerIsNotNull() {
        assertNotEquals(null, defaultBus.getProducer(), "Producer should not be null");
    }

    @Test
    @DisplayName("Should check all listed bus fields values")
    void shouldCheckBusFieldsValues() {
        assertAll("Bus fields values",
                () -> assertEquals("Bus Producer", defaultBus.getProducer().getName()),
                () -> assertEquals("26A", defaultBus.getProducer().getAddress().getBuildingNumber()),
                () -> assertEquals("00-000", defaultBus.getProducer().getAddress().getZipCode()),
                () -> assertEquals("1010101010", defaultBus.getProducer().getNipNumber()),
                () -> assertEquals("111222333", defaultBus.getProducer().getPhoneNumber()),
                () -> assertEquals(true, defaultBus.isArticulated()),
                () -> assertEquals(true, defaultBus.isLowFloor()),
                () -> assertEquals(BigDecimal.valueOf(6.7), defaultBus.getEngineCapacity())
        );
    }
}