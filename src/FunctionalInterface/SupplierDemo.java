package FunctionalInterface;

import java.util.function.Supplier;

/**
 * @author VIVEK
 * <br/>
 * Supplier gives the data.
 * <br/>
 * Represents a supplier of results.
 * There is no requirement that a new or distinct result be returned each time the supplier is invoked.
 * This is a functional interface whose functional method is get().
 * <br/>
 * Syntax: Consumer<data type of the output> = lambda expression
 * <br/>
 * Input: None
 * <br/>
 * Return Type: data type of the output
 */

public class SupplierDemo {
    static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello" + " World";
        System.out.println(supplier.get());
    }
}
