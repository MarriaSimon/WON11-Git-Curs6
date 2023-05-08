package org.fasttrackit.course14.homewrok.exercise1;

import org.fasttrackit.course14.homework.exercise1.Temperature;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureTest {

    @Test
    public void fahrenheitToCelsius() {
        Temperature converter = new Temperature();
        double result = converter.fahrenheitToCelsius(20.0);
        assertEquals(-6.67, result, 0.01);
    }


    @Test
    public void celsiusToFahrenheit(){
        Temperature converter = new Temperature();
        double result = converter.celsiusToFahrenheit(0.0);
        assertEquals(32.0, result, 0.01);

    }

    @Test
    public void fahrenheitToCelsiusFreezingPoint() {
        Temperature converter = new Temperature();
        double result = converter.fahrenheitToCelsius(32.0);
        assertEquals(0.0, result, 0.01);
    }

    @Test
    public void celsiusToFahrenheitFreezingPoint() {
        Temperature converter = new Temperature();
        double result = converter.celsiusToFahrenheit(0.0);
        assertEquals(32.0, result, 0.01);
    }

}
