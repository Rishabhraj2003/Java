package lambda;

// Define a functional interface
@FunctionalInterface
interface AddOperation {
    int add(int a, int b);
}

public class twoargu {
    public static void main(String[] args) {
        // Lambda expression with two arguments and a return value
        AddOperation sum = (a, b) -> a + b;

        // Call the lambda
        int result = sum.add(10, 20);

        System.out.println("Sum: " + result);
    }
}
