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
    }
}
