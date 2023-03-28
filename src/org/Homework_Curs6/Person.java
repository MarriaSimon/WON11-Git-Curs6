package org.Homework_Curs6;

class Person {
    private String name;
    private int age;
    private boolean married;

    public Person(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMarried() {
        /*if (married) this.married = true;
        else this.married = false;
        if (married == true) System.out.print("is married");
        else {
            System.out.print("is not married");
        }
         */
        return married;
    }
}
