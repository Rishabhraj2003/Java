package  Backtracking;

public class MaxKnightsPlacement {

    // Function to compute maximum number of knights
    public static int maxKnights(int n) {
        if (n == 1) return 1;
        if (n == 2) return 4;
        return (n * n + 1) / 2;
    }

    // Function to print chessboard visualization
    public static void printBoard(int n) {
        System.out.println("Visual Chessboard (" + n + "x" + n + "):\n");
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Place knights on alternate cells like a chessboard
                if ((i + j) % 2 == 0) {
                    System.out.print("♞ "); // Unicode knight symbol
                    count++;
                } else {
                    System.out.print(". ");  // Empty cell
                }
            }
            System.out.println();
        }

        System.out.println("\nTotal knights placed: " + count);
    }

    public static void main(String[] args) {
        int n = 6; // you can change n (like 5, 8, etc.)
        System.out.println("Maximum knights that can be placed: " + maxKnights(n));
        printBoard(n);
    }
}
