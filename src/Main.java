public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        Lamp lamp1 = new Lamp();
        Lamp lamp2 = new Lamp();

        // lamp1.lightState = true; - daca ii private numai trebuie pus aici
        lamp1.turnOn();
        lamp2.turnOn();
        Lamp customLamp = new Lamp("green", 10);
        customLamp.turnOn();
    }
}

class Lamp {
    private boolean lightState;
    private String color = "red";
    private int intensity;

    Lamp() {
        System.out.println("Startng constrcution of lamp");
        lightState = false;
        intensity = 5;
    }

    Lamp(String color, int intensity) {
        System.out.println("Starting construction of lamp with color " + color + "and intensity " + intensity);
        this.color = color;
        this.intensity = intensity;
    }

    public void turnOn() {
        System.out.println("Turning on with color " + color + "with intesity" + intensity);
        lightState = true;
    }

    public void turnOff() {
        System.out.println("Turn off");
        lightState = false;
    }
}