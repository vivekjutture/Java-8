package FunctionalInterface.CustomInterface;

/**
 * @author VIVEK
 * Functional interface can have exactly one abstract method
 * multiple default and static methods and static constants
 * @FunctionalInterface annotation helps to strictly configure the interface as a functional interface, ensures that
 * interface cannot have more than one abstract method
 */

@FunctionalInterface
public interface Calculator {
    static void sayHello() {
        System.out.println("Hello World");
    }

    default void sayBye() {
        System.out.println("Bye World");
    }

    int calculate(int a, int b);

}
