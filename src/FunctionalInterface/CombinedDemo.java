package FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface Calculation {
    int square(int x);
}

/**
 * @author VIVEK
 * <p>
 * This combined example which demonstrates funcationlity of
 * Predicate, Consumer, Supplier, Function, Functional Interface and Lambda Expression
 */

public class CombinedDemo {
    static void main(String[] args) {

        Supplier<Integer> supplier = () -> 3;
        Predicate<Integer> isOdd = i -> (i & 1) == 1;
        Consumer<Integer> consumer = System.out::println;
        Function<Integer, Integer> tenTimes = i -> i * 10;
        Calculation calculation = x -> x * x;

        if (isOdd.test(supplier.get())) {
            consumer.accept(calculation.square(tenTimes.apply(supplier.get())));
        }
    }
}


