package org.fasttrackit.course15.generics;

public class OldBox {
    private final Object item;
   // private final I item;

    public OldBox(Object item) {
        this.item = item;
    }

    public Object getItem() {
        return item;
    }
}
