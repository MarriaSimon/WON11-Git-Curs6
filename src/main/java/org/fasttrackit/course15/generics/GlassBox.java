package org.fasttrackit.course15.generics;

public class GlassBox <I, L> extends NewBox<I>{
    private final L lock;
    public GlassBox(I item, L lock){
        super(item);
        this.lock = lock;
    }
}
