package homework_curs7.animals;

public class Duck implements Animals {
    @Override
    public String walk() {
        return "Duck - walking ";
    }

    @Override
    public String talk() {
        return "Duck - quack ";
    }

    @Override
    public String eat() {
        return "Duck - eating";
    }
}
