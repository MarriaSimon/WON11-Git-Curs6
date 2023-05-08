package org.fasttrackit.course13.homework.staticpackage;

public class Airplaine {

    private static double gravityCoefficient;
    //field al clasei
    //pastram field-urile statice doar pt cazurile in care dorim sa avem un singur obiect

    //ce e static apartine de clasa, putem avea doar 1 singura clasa in aplicatie.
    //field-urile statice apartin de clasa respectiva
    //ce e non static apartine de obiect
    private String type;
    private double fuel;

    public static double getGravityCoefficient() {
        return gravityCoefficient;
    }

    public static void setGravityCoefficient(double gravityCoefficient) {
        Airplaine.gravityCoefficient = gravityCoefficient;
    }

    public String getType() {
        gravityCoefficient++;
        return type;
    }
    //dintr-o metoda non statica pot accesa o metoda statica, dar nu se poate invers

    public void setType(String type) {
        this.type = type;
    }


    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

}
