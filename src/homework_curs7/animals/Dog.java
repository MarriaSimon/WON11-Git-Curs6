package homework_curs7.animals;

public class Dog implements Animals {
    @Override
    public String walk() {
        return "Dog - walking";
    }

    @Override
    public String talk() {
        return "Dog - barking";
    }

    @Override
    public String eat() {
        return "Dog - eating";
    }
}
