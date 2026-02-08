package FunctionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * @author VIVEK
 * <br/>
 * Represents an operation upon two operands of the same type, producing a result of the same type as the operands. This is a specialization of BiFunction for the case where the operands and the result are all of the same type.
 * This is a functional interface whose functional method is apply(Object, Object).
 * This actual does the WORK for you not like Predicate just to response true/fasle.
 * <br/>
 * Syntax: BinaryOperator<data type of the input of both/output> = lambda expression
 * <br/>
 * Input: Any [Two Inputs]
 * <br/>
 * Return type: data type of the output
 */

public class BinaryOperatorFunctionDemo {
    static void main(String[] args) {
        BinaryOperator<Integer> addTwo = (x, y) -> x + y;
        System.out.println(addTwo.apply(10, 20));
        BinaryOperator<Integer> maxNum = BinaryOperator.maxBy(Comparator.comparing(Integer::intValue));
        System.out.println(maxNum.apply(10, 20));
        BinaryOperator<Integer> minNum = BinaryOperator.minBy(Comparator.comparing(Integer::intValue));
        System.out.println(minNum.apply(10, 20));
    }
}
