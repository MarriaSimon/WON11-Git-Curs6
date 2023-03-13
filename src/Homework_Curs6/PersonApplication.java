package Homework_Curs6;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ionel", 47, false);
        Person person2 = new Person("Ayana ", 20, false);
        Person person3 = new Person("Maria", 32, true);
        System.out.println("Name: " + person1.getName() + " Age: " + person1.getAge() + " IsMarried: " + person1.isMarried());
        System.out.println("Name: " + person2.getName() + " Age: " + person2.getAge() + " IsMarried: " + person2.isMarried());
        System.out.println("Name: " + person3.getName() + " Age: " + person3.getAge() + " IsMarried: " + person3.isMarried());
    }
}
