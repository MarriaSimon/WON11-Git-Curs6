package org.fasttrackit.curs8.abstractClass;

import java.util.Scanner;


public class SoloEx {
}


    /*
    public static void main(String[] args) {
        //do not touch this code
        Monopoly monopoly = new Monopoly();
        Chess chess = new Chess();
        Battleships battleships = new Battleships();

        monopoly.play();
        chess.play();
        battleships.play();
    }
}

abstract class Game {
    public String name;

    abstract String getName();

    abstract void play();
}

class Monopoly extends Game {

    //give "Monopoly" name to game
    String getName() {
        name = "Monopoly";
        return name;

    }

    // play method should print "Buy all property."
    void play() {
        System.out.println("Buy all property.");
    }
}

class Chess extends Game {

    //give "Chess" name to game
    String getName() {
        name = "Chess";
        return name;


    }

    // play method should print "Kill the enemy king."
    void play() {
        System.out.println("Kill the enemy king.");
    }
}

class Battleships extends Game {

    //give "Battleships" name to game
    String getName() {
        name = "Battleships";
        return name;
    }

    // play method should print "Sink all ships."
    void play() {
        System.out.println("Sink all ships.");
    }
}

    /*
        public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
            int a = read.nextInt();

            Pupil pupil =  new Pupil();
            pupil.setAge(a);
        }
    }

    class Pupil{
        private int age;

        //complete setter method
        public void  setAge(int a){
            if( a > 6){
                age = a;
                System.out.println("Welcome");
            }else {
                System.out.println("Sorry");
            }
        }

        public int getAge(){
            return age;
        }
    }


    /*
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String name = read.nextLine();
        int age = read.nextInt();
        Student student = new Student();
        student.name = name;
        student.setAge(age);

        //set the age via Setter


        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.getAge());
    }
}

class Student {

    public String name;
    private int age;

    public int getAge() {
        return age;

    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid age");
            this.age = 0;
        } else
            this.age = age;
    }
}




   /*
    public static void main(String[] args) {
        bot();
    }

    //your code goes here

    User message: "1", Reply: "Order confirmed"
    User message: "2", Reply: "info@sololearn.com"
    For any other number, the reply should be: "Try again".

    public static void bot() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        switch(number){
            case 1:
                System.out.println("Order Confirmed");
                break;
            case 2:
                System.out.println("info@sololearn.com");
                break;
            default:
                System.out.println("Try again");
        }
    }
}
*/