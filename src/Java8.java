import java.util.function.Predicate;


public class Java8 {
    public static void main(String[] args) {

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
    }
}
