package  exception2.java;
import java.util.*;

public class Calculator2 {

    // 🔷 Method using 'throws'
    // This method says: "I might throw an exception"
    static int divide(int a, int b) throws ArithmeticException {

        // 🔷 Using 'throw'
        // Manually throwing exception if denominator is 0
        if (b == 0) {
            throw new ArithmeticException("You cannot divide by zero!");
        }

        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int first = sc.nextInt();

        System.out.println("Enter second number:");
        int second = sc.nextInt();

        try {
            // 🔷 Calling method that uses 'throws'
            int result = divide(first, second);

            System.out.println("Result is: " + result);
        }

        // 🔷 Catching the exception thrown by 'throw'
        catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // 🔷 'finally' always runs
        finally {
            System.out.println("This block always executes (finally block)");
            sc.close();
        }
    }
}