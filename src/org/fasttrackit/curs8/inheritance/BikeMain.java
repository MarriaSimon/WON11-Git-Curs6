package org.fasttrackit.curs8.inheritance;

import java.util.Random;

public class BikeMain {
    public static void main(String[] args) {
        System.out.println("bike: ");
        Bike bike = new Bike(3);
        System.out.println(bike.getTyrePressure());

        System.out.println("mountain bike: ");
        MountainBike mountainBike = new MountainBike();
        System.out.println(mountainBike.getTyrePressure());
        mountainBike.inflateTyre(100);
        System.out.println(mountainBike.getTyrePressure());
        System.out.println(mountainBike.toString());

        System.out.println("city bike: ");
        CityBike cityBike = new CityBike(9);
        System.out.println(cityBike.getTyrePressure());

        System.out.println("Array example: ");
        Bike[] bikes = new Bike[3];
        bikes[0] = new Bike(5);
        bikes[1] = new MountainBike();
        bikes[2] = new CityBike(9);

        Random r = new Random();
        for (Bike b : bikes) {
            b.inflateTyre(100);
            System.out.println(b.getTyrePressure());
            b.increaseSpeed(r.nextInt((byte) 23));
            System.out.println(b.getTyrePressure());
        }
    }
}
