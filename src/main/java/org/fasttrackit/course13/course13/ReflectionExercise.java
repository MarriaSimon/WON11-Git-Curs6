package org.fasttrackit.course13.course13;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ReflectionExercise {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        PersonLombok person = new PersonLombok("John", 33, "Romania", false, "FastTrack");
        person.getAge();
        Field field = PersonLombok.class.getDeclaredField("youWillNeverSee");
        field.setAccessible(true);
        field.set(person, true);
        System.out.println("test");

        Annotation[] annotations = field.getAnnotations();
        System.out.println(" ");

        Field children = PersonLombok.class.getDeclaredField("children");
        PopulateChild annotation = children.getAnnotation(PopulateChild.class);
        children.setAccessible(true);
        // children.set(person, annotation.children());
        System.out.println("");

        children.setAccessible(true);

    }

}
