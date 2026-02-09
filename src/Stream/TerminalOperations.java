package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author VIVEK
 * short circuit methods are those methods who stopsprocessing when they met the condition
 * eg: anyMatch, allMatch, noneMatch, findFirst, findAny *
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


        //Practice example
        List<String> counties = Arrays.asList("India", "Japan", "France", "Germany", "United Kingdom", "United States");

        System.out.println(counties.stream().filter(c -> c.length() > 5).toList());

        List<Integer> nums = List.of(5, 7, 9, 6, 3, 2, 5);
        System.out.println(nums.stream().map(n -> n * n).sorted().distinct().toList());

        // count number of occurrences of a character
        String sentence = "Java is a robust programming language";
        IntStream sentenceStream = sentence.chars();
        System.out.println("Occurrences of 'a' : " + sentenceStream.filter(x -> x == 'a').count());
    }
}
