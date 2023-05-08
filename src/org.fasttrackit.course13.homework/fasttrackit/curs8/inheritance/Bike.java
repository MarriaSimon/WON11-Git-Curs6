package org.fasttrackit.course13.homework.fasttrackit.curs8.inheritance;

public class Bike {
    protected static int maxPressure = 10;
    private int tyrePressure;
    private int speed;
    public BikeWheel bikeWheel = new BikeWheel();

    // public Bike(){}
    public Bike(int tyrePressure) {
        this.tyrePressure = tyrePressure;
    }

    public void increaseSpeed(int amount) {
        this.speed += amount;
    }

    //overloading
    public void increaseSpeed(byte multiplier, int amount) {
        this.speed += this.speed * multiplier;
    }

    //overloading
    public void increaseSpeed() {
        this.speed++;
    }

    public void stop() {
        this.speed = 0;
    }

    public void flatTyre() {
        System.out.println("oops my bike got a flat tyre!");
        tyrePressure = 0;
    }

    public void inflateTyre(int amount) {
        tyrePressure += amount;
        if (tyrePressure > maxPressure) {
            flatTyre();
        }
    }

    public int getTyrePressure() {
        return tyrePressure;
    }

    public int getSpeed() {
        return speed + bikeWheel.size;
    }

    public static int getMaxPressure() {
        return maxPressure;
    }

    public static void setMaxPressure(int maxPressure) {
        Bike.maxPressure = maxPressure;
    }

    private class BikeWheel {
        private int size;

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }
    }
}
