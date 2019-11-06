package FFHS;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Make the annotation available at runtime:
@Target(ElementType.TYPE) // Allow to use only on types:

public @interface Todo {
    String task(); //what is to Do for the future Release

    int release(); // number of release

}
