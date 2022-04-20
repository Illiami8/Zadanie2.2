package Lesson_36;

import java.util.List;

public interface Printable {
    void print(Object o);

    default void print(List<?> list){
        for(Object o : list){
            print(o);
        }
    }
}
