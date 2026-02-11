package Optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        System.out.println(getName().orElse("NA"));

        getVersion().ifPresent(System.out::println);
    }

    private static Optional<String> getName() {
        return Optional.of("java");
    }

    private static Optional<Integer> getVersion() {
        return Optional.empty();
    }
}
