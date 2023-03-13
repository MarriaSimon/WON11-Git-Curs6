package Homework_Curs6;


public class BottleApplication {
    public static void main(String[] args) {
        Bottle bottle = new Bottle(750, 750, "plastic");
        System.out.println("Bottle's capacity: " + bottle.getBottleVolume() + " ml," + " color: " + bottle.getColor() + " ,material: " + bottle.getMaterial() + " ,has cap: " + bottle.isHasCap());
        System.out.println("\nBottle is open: " + bottle.open());
        System.out.println("Bottle's empty capacity: " + bottle.getEmptyCapacity());
        System.out.println("Bottle's maximum capacity: " + bottle.getCurrentVolume());

        System.out.println("\nDrank liquid: " + bottle.drink(100));
        System.out.println("Drank liquid: " + bottle.drink(250));
        System.out.println("Drank liquid: " + bottle.drink(150));


        System.out.println("\nRefill's capacity: " + bottle.fillUp(0));
        System.out.println("\nBottle is closed: " + bottle.closed());

    }
}
