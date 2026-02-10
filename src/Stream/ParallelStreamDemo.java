package Stream;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/**
 * @author VIVEK
 * A type of a stream that enables parallel processing of elements
 * allowing multiple thread to process parts of stream simultaneously
 * improves the performance for  larger data sets
 * workload is distributed across multiple threads
 * not suitable for smallar data sets may cause overhead
 * Usage: large datasets,sequence doesn't matter and data is independent
 * like in below example factorial is independent but cumulative sum is dependent
 */

public class ParallelStreamDemo {
    private static Long fact(long n) {
        long fact = 1L;
        for (long i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static void main(String[] args) {
        List<Long> list = Stream.iterate(1L, x -> x + 1).limit(20000).toList();

        // without parallel stream
        long startTime = System.currentTimeMillis();
        List<Long> factList = list.stream().map(ParallelStreamDemo::fact).toList();
        System.out.println("Time takes without parallel stream : " + (System.currentTimeMillis() - startTime) + " ms");

        // with parallel stream
        startTime = System.currentTimeMillis();
        factList = list.parallelStream().map(ParallelStreamDemo::fact).toList();
        System.out.println("Time takes with parallel stream : " + (System.currentTimeMillis() - startTime) + " ms");

        // sequential stream
        factList = list.parallelStream().map(ParallelStreamDemo::fact).sequential().toList();

        //cumulative sum [1,2,3] -> [1,3,6]
        List<Integer> nums = Stream.iterate(1, x -> x + 1).limit(100).toList();
        AtomicInteger sum = new AtomicInteger(0);
        System.out.println(nums.stream().map(sum::addAndGet).toList());


    }
}
