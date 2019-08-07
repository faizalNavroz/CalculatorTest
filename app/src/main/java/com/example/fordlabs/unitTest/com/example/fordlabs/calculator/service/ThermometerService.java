package com.example.fordlabs.unitTest.com.example.fordlabs.calculator.service;

public class ThermometerService {

    public Double getTemperatureInCelcius(Double fahrenheit) {
        double celsius = ((5 * (fahrenheit - 32.0)) / 9.0);
        return celsius;
    }

    public Double getTemperatureInFarenheit(Double celsius) {
        double fahrenheit = (9.0 / 5.0) * celsius + 32;
        return fahrenheit;
    }
}
