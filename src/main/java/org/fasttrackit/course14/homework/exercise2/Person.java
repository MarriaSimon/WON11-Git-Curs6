package org.fasttrackit.course14.homework.exercise2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
//@RequiredArgsConstructor
@ToString

public class Person {
    //l Person(id, name, age)
    //. Creati teste si pentru Person astfel incat sa nu poata fi creata o persoana fictiva (varsta invalida, nume null.
    private static int id;
   private static String name;
   private static int age;

    public static int getId() {
        return id;
    }

    public static String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }

    public Person(){
        this.age = age;
        this.name = name;
        this.id = id;
    }



    public Person(String name, int age) {
        this.name = name;
        this.age = age;

        if(name == null || name.isEmpty() || name.contains("\s")){
            throw new IllegalArgumentException("Not a valid name. Please enter the full name");
        }
        if(age <= 0 || age > 120){
            throw new IllegalArgumentException("Age is not valid. Please enter a number from 1 to 99");
        }
    }

    public void setId(int idPers) {
    }
}
