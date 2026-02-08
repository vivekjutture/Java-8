import java.util.function.Predicate;

/**
 * @author VIVEK
 * <br/>
 * 1. Lambda expression is an ANONYMOUS function
 * (no access modifier, no return type and no name)
 * <br/>
 * 2. Lambda expression is used to implement Functional Interface
 */


public class LambdaExpressionDemo {
    static void main(String[] args) {

        // without Lambda Expression
        Thread thread1 = new Thread(new MyThread());
        thread1.start();

        // with Lambda Expression
        Thread thread2 = new Thread(() ->
                System.out.println("MyThread is running")
        );
        thread2.start();
        
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(5));

        // with Functional Interface
        MathOperation sum = (a, b) -> a + b;
        System.out.println(sum.calculate(10, 20));

        MathOperation diff = (a, b) -> a - b;
        System.out.println(diff.calculate(10, 20));

        MathOperation multiplication = (a, b) -> a * b;
        System.out.println(multiplication.calculate(10, 20));


    }
}

/**
 * Custom Thread Class
 */
class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println("MyThread is running");
    }
}