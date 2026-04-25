package lambda;

// Functional interface for comparison
@FunctionalInterface
interface CompareNumbers {
    int getMax(int a, int b);
}

public class ConditionalLambda {
    public static void main(String[] args) {
        // Lambda expression with condition and return value
        CompareNumbers maxFinder = (a, b) -> {
            if (a > b)
                return a;
            else
                return b;
        };

        int result = maxFinder.getMax(15, 25);
        System.out.println("Greater number is: " + result);
    }
}
