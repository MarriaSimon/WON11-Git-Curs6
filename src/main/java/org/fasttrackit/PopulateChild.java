package org.fasttrackit;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
@Retention(RetentionPolicy.RUNTIME)
public @interface PopulateChild {
    int childs() default 0;

}
