package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author VIVEK
 * Converts one stream into another stream
 * <br/>
 * They are LAZY in nature, means they won't execute unless and untill terminal operation is invoked.
 * stateful operations : who know other elements or rely on other elements of the stream eg. sorting
 * stateless operations: who doesn't care about other elementsor not rely on other elements eg.squaring num using map
 */

public class IntermediateOperations {
    static void main(String[] args) {

        List<String> spokenLanguages = new ArrayList<>(Arrays.asList("English", "German", "French", "Spanish", "Arabian", "Japanese"));
        System.out.println(spokenLanguages);

        // filter operation -> filter out the data in stream
        System.out.println(spokenLanguages.stream().filter(x -> x.toLowerCase().endsWith("n")).toList());

        // sort the list alphabetically
        System.out.println(spokenLanguages.stream().sorted().toList());

        //sort ths list wth each element's length
        System.out.println(spokenLanguages.stream().sorted((x, y) -> x.length() - y.length()).toList());

        //convert everything to uppercase
        System.out.println(spokenLanguages.stream().map(String::toUpperCase).toList());


        // get the list of distinct [unique] elements
        spokenLanguages.add("English");
        spokenLanguages.add("French");
        spokenLanguages.add("Spanish");
        System.out.println(spokenLanguages.stream().distinct().toList());

        // infinite stream
        System.out.println(Stream.generate(() -> "Hello").limit(10).toList());
        System.out.println(Stream.iterate(1, x -> x + 1).limit(20).toList());
        // skip
        System.out.println(Stream.iterate(1, x -> x + 1).skip(10).limit(20).toList());

        // peek [performs in between operation]
        Stream.iterate(1, x -> x + 1).limit(20).peek(System.out::println).count();

        // stateful and stateless operations
        System.out.println("Sorted : " + Stream.of(7, 45, 1, 8, 56, 6, 1, 5, 6, 3).sorted().toList()); // stateful

        System.out.println("Squares : " + Stream.of(7, 45, 1, 8, 56, 6, 1, 5, 6, 3).map(x -> x * x).toList()); //
        // stateless

        // faltMap
        // handles the stream of collections, list or arrays where each element itself is a collection
        // Flatten nested structures (e.g., lists within lists) so they can process as single sequence of elements
        // Transform and flatten elements at a same time
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("orange", "kiwi"),
                Arrays.asList("pear", "grape")
        );
        System.out.println(listOfLists.get(0).get(1));
        System.out.println(listOfLists.stream().flatMap(x -> x.stream()).map(String::toUpperCase).toList());

        List<String> sentences = Arrays.asList(
                "Hello world",
                "Java streams are powerful",
                "flatMap is useful"
        );

        System.out.println(sentences.stream().flatMap(x -> Arrays.stream(x.split(" "))).map(String::toLowerCase).toList());

    }
}
