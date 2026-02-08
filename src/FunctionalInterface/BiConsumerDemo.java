package FunctionalInterface;

import java.util.function.BiConsumer;

/**
 * @author VIVEK
 * <br/>
 * Consumer consumes/takes the data.
 * <br/>
 * Represents an operation that accepts two input arguments and returns no result. This is the two-arity specialization of Consumer. Unlike most other functional interfaces,
 * <br/>
 * This is a functional interface whose functional method is accept(Object, Object).
 * <br/>
 * Syntax: Consumer<data type of the input1,data type of the input1> = lambda expression
 * <br/>
 * Input: Any [Two Inputs]
 * <br/>
 * Output: None
 */

public class BiConsumerDemo {
    static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer1 = (a, b) -> System.out.println(a + b);
        biConsumer1.accept("abc-", 1);

        BiConsumer<String, Integer> biConsumer2 = (a, b) -> System.out.println(a + a + b + b);
        biConsumer2.andThen(biConsumer1).accept("abc-", 1);
    }
}
