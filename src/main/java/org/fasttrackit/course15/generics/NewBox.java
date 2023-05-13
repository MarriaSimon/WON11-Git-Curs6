package org.fasttrackit.course15.generics;

public class NewBox<I> {
    private final I item;

    public NewBox(I item) {
        this.item = item;
    }

    public I getItem() {
        return item;
    }

    public void printContent() {
        System.out.println(item.toString());
    }
}
