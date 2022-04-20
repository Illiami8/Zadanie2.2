package Lesson_37;

import java.util.function.Predicate;

public class StringUtilDemo {

    public static void main(String[] args) {
        String nullStr = null;
        String name = "Victor";
        String emptyStr = "";
        Predicate<String> notNullPredicate = s -> s != null;
        Predicate<String> notEmptyPredicate = s -> !"".equals(s);
        Predicate<String> notEmptyAndNotNull = notEmptyPredicate.and(notNullPredicate);
        print(nullStr, notNullPredicate);
        print(name, notNullPredicate);
        print(name,notEmptyPredicate);
        print(emptyStr,notEmptyPredicate);
        print(nullStr,notEmptyAndNotNull);

    }

    private static Predicate<String> getStringPredicate() {
        return (String s) -> s != null;
    }

    static void print(String str, Predicate<String> predicate) {
        System.out.println(predicate.test(str));
    }
}
