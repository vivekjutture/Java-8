package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author VIVEK
 * short circuit methods are those methods who stops processing when they met the condition
 * eg: anyMatch, allMatch, noneMatch, findFirst, findAny
 */

public class TerminalOperations {
    static void main(String[] args) {
        List<Integer> list = List.of(4, 1, 7, 8, 5, 1, 5, 3, 6, 2);

        // 1. collect
        System.out.println(list.stream().skip(5).collect(Collectors.toSet()));

        // 2. for each
        list.stream().forEach(System.out::println);
        System.out.println();

        // 3. reduce
        Optional<Integer> ans = list.stream().distinct().reduce(Integer::sum);
        System.out.println(ans.orElse(null));

        // 4. count
        System.out.println(list.stream().filter(x -> x % 2 == 0).count());

        // 5. anyMatch, allMatch, noneMatch

        boolean isAnyMatch = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(isAnyMatch);
        boolean isAllMatch = list.stream().allMatch(x -> x % 2 == 0);
        System.out.println(isAllMatch);
        boolean isNoneMatch = list.stream().noneMatch(x -> x < 0);
        System.out.println(isNoneMatch);

        //6. findFirst, findAny
        System.out.println(list.stream().findFirst().orElse(null));
        System.out.println(list.stream().findAny().orElse(null));

        // 7. toArray
        Object[] arr = Stream.of(1, 2, 3).toArray();

        // 8. min/max
        System.out.println("Max : " + Stream.of(7, 8, 96, 2, 3, 44, 58).max(Comparator.naturalOrder()).orElse(null));
        System.out.println("Min : " + Stream.of(7, 8, 96, 2, 3, 44, 58).min((val1, val2) -> val1 - val2).orElse(null));

        //9. forEachOrdered
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Using forEach with parallel stream");
        numbers.parallelStream().forEach(System.out::println);
        System.out.println("Using forEachOrdered with parallel stream");
        numbers.parallelStream().forEachOrdered(System.out::println);


        //Practice example
        List<String> counties = Arrays.asList("India", "Japan", "France", "Germany", "United Kingdom", "United States");

        System.out.println(counties.stream().filter(c -> c.length() > 5).toList());

        List<Integer> nums = List.of(5, 7, 9, 6, 3, 2, 5);
        System.out.println(nums.stream().map(n -> n * n).sorted().distinct().toList());

        // count number of occurrences of a character
        String sentence = "Java is a robust programming language";
        IntStream sentenceStream = sentence.chars();
        System.out.println("Occurrences of 'a' : " + sentenceStream.filter(x -> x == 'a').count());

        // Example
        // Streams cannot be reused after a terminal operation has been called that means it's consumed
        Stream<String> stream = counties.stream();
        stream.forEach(System.out::println);
        // List<String> list1 = stream.map(String::toUpperCase).toList(); // exception
    }
}
