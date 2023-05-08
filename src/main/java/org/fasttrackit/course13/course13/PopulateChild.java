package org.fasttrackit.course13.course13;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

@Retention(RetentionPolicy.RUNTIME)
public @interface PopulateChild {
    int children() default 0;
}


