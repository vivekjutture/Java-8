package FunctionalInterface.StreamApiPrereq;

/**
 * @author VIVEK
 * <br/>
 * Functional Interface is a interface/class whihc has EXACTLY ONE ABSTRACT method (only 1)
 * It can have default methods as they have implemnetations
 */

@FunctionalInterface
public interface MathOperation {
    int calculate(int a, int b);
}
