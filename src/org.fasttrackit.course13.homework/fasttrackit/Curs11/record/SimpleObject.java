package org.fasttrackit.course13.homework.fasttrackit.Curs11.record;

public class SimpleObject {
    public SimpleObject(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "SimpleObject{" +
                "a=" + a +
                '}';
    }

    private int a;
}
