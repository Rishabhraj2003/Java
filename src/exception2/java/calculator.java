package exception2.java;
import java.util.*;

public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the two numbers");

        System.out.println("Enter first number:");
        int first = sc.nextInt();

        System.out.println("Enter second number:");
        int second = sc.nextInt();

        int result = 0;

        try {
            result = first / second;
            System.out.println("The result is: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }
        finally {
            System.out.println("Calculation attempt finished.");
            sc.close();
        }
    }
}