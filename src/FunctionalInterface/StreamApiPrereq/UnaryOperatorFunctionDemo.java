package FunctionalInterface.StreamApiPrereq;

import java.util.function.UnaryOperator;

/**
 * @author VIVEK
 * <br/>
 * Represents an operation on a single operand that produces a result of the same type as its operand. This is a specialization of Function for the case where the operand and result are of the same type.
 * This is a functional interface whose functional method is apply(Object).
 * This actual does the WORK for you not like Predicate just to response true/fasle.
 * <br/>
 * Syntax: UnaryOperator<data type of the input/output> = lambda expression
 * <br/>
 * Input: Any [Single Input]
 * <br/>
 * Return type: data type of the output
 */

public class UnaryOperatorFunctionDemo {
    static void main(String[] args) {
        UnaryOperator<Integer> addOne = x -> x + 1;
        System.out.println(addOne.apply(10));
        System.out.println(UnaryOperator.identity().apply(7));
    }
}
