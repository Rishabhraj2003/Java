package lambda;

public class noexp {
    public static void main(String[] args) {
        // Lambda expression with no arguments using Runnable
        Runnable r = () -> System.out.println("Hello Rishabh!");

        // Run the lambda
        r.run();
    }
}
