package extra;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {

        // 1️⃣ Predicate<T> - takes input, returns boolean
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 10 even? " + isEven.test(10));
        System.out.println("Is 7 even? " + isEven.test(7));

        System.out.println("---------------------------");

        // 2️⃣ Function<T, R> - takes input, returns a result
        Function<Integer, Integer> square = n -> n * n;
        System.out.println("Square of 5: " + square.apply(5));
        System.out.println("Square of 9: " + square.apply(9));

        System.out.println("---------------------------");

        // 3️⃣ Consumer<T> - takes input, performs action, returns nothing
        Consumer<String> greet = name -> System.out.println("Hello, " + name + "!");
        greet.accept("Rishabh");
        greet.accept("Java");

        System.out.println("---------------------------");

        // 4️⃣ Supplier<T> - takes no input, returns a value
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Random value 1: " + randomValue.get());
        System.out.println("Random value 2: " + randomValue.get());
    }
}
