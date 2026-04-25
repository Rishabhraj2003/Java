package conditionals;
import java.util.Scanner;

public class FibbonaciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: how many Fibonacci numbers to print
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Handle edge cases
        if (n <= 0) {
            System.out.println("Please enter a number greater than 0.");
        } else if (n == 1) {
            System.out.println("Fibonacci Series: 0");
        } else {
            int a = 0, b = 1;

            System.out.print("Fibonacci Series: ");
            System.out.print(a + " " + b + " "); // print first two numbers

            for (int i = 2; i < n; i++) {
                int fib = a + b;
                System.out.print(fib + " ");
                a = b;
                b = fib;
            }
        }

        sc.close();
    }
}
