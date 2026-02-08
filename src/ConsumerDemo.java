import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author VIVEK
 * <br/>
 * Consumer consumes/takes the data.
 * <br/>
 * Represents an operation that accepts a single input argument and returns no result
 * <br/>
 * This is a functional interface whose functional method is accept(Object).
 * <br/>
 * Syntax: Consumer<data type of the input> = lambda expression
 * <br/>
 * Input: Any [Single Input]
 * <br/>
 * Output: None
 */

public class ConsumerDemo {
    static void main(String[] args) {
        Consumer<String> consumer = str -> System.out.println(str);
        consumer.accept("Hello");
        Consumer<String> printName = System.out::println;
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Consumer<List<Integer>> listConsumer = x -> {
            for (Integer i : x) {
                System.out.println(i);
            }
        };
        listConsumer.accept(list);
        printName.andThen(consumer).accept("Java");
    }
}
