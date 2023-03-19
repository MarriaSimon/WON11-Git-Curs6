package homework_curs7.animals;

public class Chicken implements Animals {
    @Override
    public String walk() {
        return "Chicken - walking";
    }

    @Override
    public String talk() {
        return "Chicken - clucking ";
    }

    @Override
    public String eat() {
        return "Chicken -eating";
    }
}
