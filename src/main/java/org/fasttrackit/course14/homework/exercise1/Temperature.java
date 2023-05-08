package org.fasttrackit.course14.homework.exercise1;

public class Temperature {
    public double fahrenheitToCelsius(double temperature) {

        double celsius = (temperature - 32) * 5/9;
        return celsius;
    }

    public double celsiusToFahrenheit(double temperature) {
        double fahrenheit = temperature * 9 / 5 + 32;
        return fahrenheit;
    }
}
