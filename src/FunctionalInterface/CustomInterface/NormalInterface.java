package FunctionalInterface.CustomInterface;

/**
 * @author VIVEK
 * Normal interface can have multiple abstract methods
 * multiple default and static methods and static constants
 */

public interface NormalInterface {

    float PI = 3.14f;

    static Float getCircleArea(int r) {
        return NormalInterface.PI * r * r;
    }

    void sayHello();

    void sayBye();

    default void getStatus() {
        System.out.println("Mood is good");
    }

    default void getUpdate() {
        System.out.println("Work in progress");
    }
}
