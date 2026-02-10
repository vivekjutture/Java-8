package Stream;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author VIVEK
 * Lazy evaulation process only after terminal operation is applied/performed
 */
public class LazyEvaluationDemo {
    static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Stream<Integer> stream = nums.stream().filter(x -> {
            System.out.println("Filtering : " + x);
            return x % 2 == 0;
        });
        System.out.println("Before terminal operation : " + nums.stream().toList());

        System.out.println("After terminal operation : " + stream.toList());
    }
}
