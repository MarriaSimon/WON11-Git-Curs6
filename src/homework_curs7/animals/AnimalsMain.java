package homework_curs7.animals;


public class AnimalsMain {
    public static void main(String[] args) {
        Animals cat = new Cat();
        System.out.println(cat.walk());
        System.out.println(cat.talk());
        System.out.println(cat.eat());

        Animals chicken = new Chicken();
        System.out.println("\n" + chicken.walk());
        System.out.println(chicken.talk());
        System.out.println(chicken.eat());

        Animals dog = new Dog();
        System.out.println("\n" + dog.walk());
        System.out.println(dog.talk());
        System.out.println(dog.eat());

        Animals duck = new Duck();
        System.out.println("\n" + duck.walk());
        System.out.println(duck.talk());
        System.out.println(duck.eat());

        Animals mouse = new Mouse();
        System.out.println("\n" + mouse.walk());
        System.out.println(mouse.talk());
        System.out.println(mouse.eat());
    }
}
