package FunctionalInterface.StreamApiPrereq;

import java.util.function.BiFunction;

/**
 * @author VIVEK
 * <br/>
 * Represents a function that accepts two arguments and produces a result. This is the two-arity specialization of Function.
 * This is a functional interface whose functional method is apply(Object, Object).
 * This actual does the WORK for you not like Predicate just to response true/fasle.
 * <br/>
 * Syntax: Function<data type of the input1,data type of the input2,data type of the output> = lambda expression
 * <br/>
 * Input: Any [Two Inputs]
 * <br/>
 * Return type: data type of the output
 */

public class BiFunctionDemo {
    static void main(String[] args) {
        BiFunction<String, Integer, String> biFunction1 = (a, b) -> a + b;
        System.out.println(biFunction1.apply("xyz-", 100));
    }
}
