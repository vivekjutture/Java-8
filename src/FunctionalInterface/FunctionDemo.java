package FunctionalInterface;

import java.util.function.Function;

/**
 * @author VIVEK
 * <br/>
 * Represents a function that accepts one argument and produces a result.
 * This is a functional interface whose functional method is apply(Object).
 * This actual does the WORK for you not like Predicate just to response true/fasle.
 * <br/>
 * Syntax: Function<data type of the input,data type of the output> = lambda expression
 * <br/>
 * Input: Any [Single Input]
 * <br/>
 * Return type: data type of the output
 */

public class FunctionDemo {
    static void main(String[] args) {
        Function<Integer, Integer> fourTimes = x -> x * 4;
        System.out.println(fourTimes.apply(10));
        Function<Integer, Integer> twoTimes = x -> x * 2;
        System.out.println(fourTimes.apply(5));
        System.out.println(fourTimes.andThen(twoTimes).apply(5)); // andThen(after) -> first evaluate the called and then the after one
        System.out.println(fourTimes.compose(twoTimes).apply(5)); // compose(before) -> first evaluate the before function then the called one
        Function<Integer, Integer> identity = Function.identity(); // same as input -> input = output
        System.out.println(identity.apply(9)); // output is 9
    }
}
