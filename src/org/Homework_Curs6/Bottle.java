package org.Homework_Curs6;

public class Bottle {
    private int bottleVolume;
    public final static int DEFAULT_MAXIMUM_BOTTLE_VOLUME = 750;
    private int initialVolume;
    private String color = "white";
    private String material;

    private boolean isOpen;
    private boolean hasCap;

    public Bottle() {
        this.bottleVolume = DEFAULT_MAXIMUM_BOTTLE_VOLUME;
    }

    public Bottle(final int bottleVolume, int initialVolume, String material) {
        this.bottleVolume = bottleVolume;
        this.initialVolume = initialVolume;
        this.material = material;
        this.isOpen = false;
        this.hasCap = true;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isHasCap() {
        return hasCap;
    }

    public int getBottleVolume() {
        return bottleVolume;
    }

    public int getEmptyCapacity() {
        return bottleVolume - initialVolume;
    }

    public int getCurrentVolume() {
        return bottleVolume - getEmptyCapacity();
    }

    public String open() {
        if (isOpen) {
            return "Bottle is already open";
        } else {
            isOpen = true;
            return "Bottle is opened";
        }
    }

    public String closed() {
        if (isOpen) {
            isOpen = false;
            return "Bottle is closed";
        } else {
            return "Bottle is already closed";
        }
    }

    public String drink(int amount) {

        if (!isOpen) {
            return "Bottle is closed";
        } else if (amount > bottleVolume) {
            return "Not enough liquid in the bottle";
        } else {
            bottleVolume -= amount;
            return "Drank " + amount + " ml from the bottle";
        }
    }

    public String fillUp(int amount) {
        int emptyValue = getEmptyCapacity();
        if (!isOpen) {
            return "Bottle is closed";
        } else if (amount >= emptyValue) {
            return "Please refill " + (bottleVolume - amount) + " ml";
        } else {
            // fillUpValue = emptyValue;
            return "Bottle empty";
        }
    }
}