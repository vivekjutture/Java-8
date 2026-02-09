package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author VIVEK
 * <p>
 * Stream is strongest feature of Java 8
 * <br/>
 * Stream is used to process collection of data in Functional and Declarative manner
 * <br/>
 * simplify data processing
 * <br/>
 * uses Functional Programming
 * <br/>
 * improves Readability and Maintainability
 * <br/>
 * enables easy Parallelism
 * <br/>
 * What is Stream?
 * <br/>
 * Stream us sequence of elements supports various operations (Functional and Declarative programming)
 * <br/>
 * How to use Stream?
 * <br/>
 * source -> intermediate operations -> terminal operation
 */


public class StreamDemo {
    static void main(String[] args) {

        // from List [Arrays as a List]
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> listStream = list.stream();
        System.out.println(listStream.reduce(0, Integer::sum));
        System.out.println(list.stream().filter(x -> x % 2 == 0).toList());
        System.out.println("Odd count :  " + list.stream().filter(x -> (x & 1) == 0).count());

        // from Arrays
        String[] languages = {"Java", "C#", "Python", "PHP"};
        Stream<String> stream = Arrays.stream(languages);
        System.out.println(stream.toList());

        // using Stream of
        Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(intStream.toList());
    }
}
