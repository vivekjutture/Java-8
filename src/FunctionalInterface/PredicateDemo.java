package FunctionalInterface;

import java.util.function.Predicate;

/**
 * @author VIVEK
 * <br/>
 * Represents a predicate (boolean-valued function) of one argument.
 * This is a functional interface whose functional method is test(Object).
 * <br/>
 * Syntax: Predicate<data type of the input> = lambda expression
 * <br/>
 * Input: Any [Single Input]
 * <br/>
 * Return type: boolean
 */

public class PredicateDemo {
    static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0; // lambda expressin
        System.out.println(isEven.test(4));
        System.out.println(isEven.test(3));
        Predicate<String> isStartsWithA = x -> x.toLowerCase().startsWith("a");
        System.out.println(isStartsWithA.test("abc"));
        Predicate<String> isLowercase = x -> x.toLowerCase().equals(x);
        Predicate<String> combinedPredicate = isStartsWithA.and(isLowercase);
        System.out.println(combinedPredicate.test("aBc"));
    }
}
