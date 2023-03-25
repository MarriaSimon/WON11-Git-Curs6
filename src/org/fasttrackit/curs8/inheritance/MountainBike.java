package org.fasttrackit.curs8.inheritance;

public class MountainBike extends Bike {
    private int tyrePressure;
    private int suspensionStrength;

    public MountainBike() {
        super(6);
        this.increaseSpeed(1);
        // this.tyrePressure = 0;

    }

    public int getSuspensionStrength() {
        return suspensionStrength;
    }

    public void setSuspensionStrength(int suspensionStrength) {
        this.suspensionStrength = suspensionStrength;
    }

    @Override
    public void flatTyre() {
        System.out.println("this wheel was worth the money");
        tyrePressure = maxPressure;
    }

    @Override
    public String toString() {
        return "MountainBike{" +
                "tyrePressure=" + tyrePressure +
                ", suspensionStrength=" + suspensionStrength +
                ", bikeWheel=" + bikeWheel +
                '}';
    }
}
