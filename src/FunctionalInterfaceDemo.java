/**
 * @author VIVEK
 * <br/>
 * Functional Interface is a interface/class whihc has EXACTLY ONE ABSTRACT method (only 1)
 * It can have default methods as they have implemnetations
 */

@FunctionalInterface
interface MathOperation {
    int calculate(int a, int b);
}

public class FunctionalInterfaceDemo {
    static void main(String[] args) {
        // Interface name = lambda expression
        MathOperation mathOperation = (a, b) -> a * b;
        System.out.println(mathOperation.calculate(10, 20));
    }
}

