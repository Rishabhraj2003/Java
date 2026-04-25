package lambda;

// Define a functional interface
@FunctionalInterface
interface Greet {
    void sayHello(String name);
}

public class oneargu{
    public static void main(String[] args) {
        // Lambda expression with one argument
        Greet greet = (name) -> System.out.println("Hello, " + name + "!");

        // Call the lambda
        greet.sayHello("Rishabh");
    }
}
