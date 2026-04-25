package dp2.catalan;
public class rec{

    // Recursive function to find nth Catalan number
    public static int catalan(int n) {
        // Base case
        if (n <= 1)
            return 1;

        int result = 0;

        // Recursively calculate the Catalan number
        for (int i = 0; i < n; i++) {
            result += catalan(i) * catalan(n - 1 - i);
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5; // Example
        System.out.println("Catalan number C(" + n + ") = " + catalan(n));
    }
}
