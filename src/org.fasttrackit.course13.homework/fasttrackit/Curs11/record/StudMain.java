package org.fasttrackit.course13.homework.fasttrackit.Curs11.record;

public class StudMain {
    public static void main(String[] args) {
        Student student = new Student("John", 20);
        student = birthday(student);
        System.out.println((student.name() + " has age " + student.age()));
        System.out.println(student);
        //System.out.println(student.name() + " has age : " + student.age());

        // int a = 10;
        // increment(a);
        // System.out.println("outside " + a);


      //  SimpleObject simpleObject = new SimpleObject(10);
      //  incrementObject(simpleObject);
      //  System.out.println("outside integer" + simpleObject);
    }
    public static Student birthday(Student s){
        Student newStudent = new Student(s.name(), s.age()+1);
        System.out.println(newStudent.age());
        return newStudent;
    }
    public static void increment(int a) {//parametrul e trimis prin valoare
        a++;
        System.out.println("Inside " + a);
    }

    public static void incrementObject(SimpleObject b) {
        b.setA(11);
        System.out.println("inside integer " + b);
    }
}
