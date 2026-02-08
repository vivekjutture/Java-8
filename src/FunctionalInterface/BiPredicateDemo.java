package FunctionalInterface;

import java.util.function.BiPredicate;

/**
 * @author VIVEK
 * <br/>
 * Represents a predicate (boolean-valued function) of two argument.This is the two-arity specialization of Predicate.
 * This is a functional interface whose functional method is test(Object,Object).
 * <br/>
 * Syntax: Predicate<data type of the input1,data type of the input2> = lambda expression
 * <br/>
 * Input: Any [Two Inputs]
 * <br/>
 * Return type: boolean
 */

public class BiPredicateDemo {
    static void main(String[] args) {
        BiPredicate<Integer, Integer> isDivisible = (i, j) -> i % j == 0;
        System.out.println(isDivisible.test(4, 2));

        BiPredicate<Integer, Integer> arePositive = (i, j) -> i > 0 && j > 0;
        System.out.println(arePositive.and(isDivisible).test(4, -1));
        System.out.println(arePositive.or(isDivisible).test(4, -2));
        System.out.println(arePositive.negate().test(4, -1));
    }
}
