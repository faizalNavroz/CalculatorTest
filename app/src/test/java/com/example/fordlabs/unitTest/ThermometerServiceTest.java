package com.example.fordlabs.unitTest;

import com.example.fordlabs.unitTest.com.example.fordlabs.calculator.service.ThermometerService;

import org.junit.Test;

import static org.junit.Assert.*;


public class ThermometerServiceTest {

    ThermometerService thermometerService = new ThermometerService();

    @Test
    public void testTemperatureInCelcius() {
        Double farenheit = 98.6;
        assertEquals(37, thermometerService.getTemperatureInCelcius(farenheit), 0.01);
    }

    @Test
    public void testTemperatureInFarenheit() {
        Double celsius = 37.00;
        assertEquals(98.60, thermometerService.getTemperatureInFarenheit(celsius), 0.01);
    }
}
