package FunctionalInterface.CustomInterface;

public class FunctionalInterfaceDemo implements Calculator {
    static void main(String[] args) {
        FunctionalInterfaceDemo f = new FunctionalInterfaceDemo();
        System.out.println(f.calculate(10, 20));
        Calculator.sayHello();
        f.sayBye();
    }

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
