package Backtracking;

public class nqueens {
    public static void main(String[] args) {
        int n = 6; // You can change this value to solve for any N (e.g., 4, 5, 8)
        char[][] board = new char[n][n];

        // Step 1: Initialize the chessboard with 'X' (indicating empty cells)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        // Step 2: Start placing queens from the first row (row = 0)
        nqueen(board, 0);
    }

    /**
     * Recursive function to place N queens on the board.
     *
     * @param board - current state of the chessboard
     * @param row   - current row we are trying to place a queen
     */
    private static void nqueen(char[][] board, int row) {
        int n = board.length;

        // ✅ Base case: If all queens are placed successfully
        if (row == n) {
            printBoard(board);
            return;
        }

        // Step 3: Try placing the queen in every column of the current row
        for (int col = 0; col < n; col++) {

            // Check if it's safe to place a queen at (row, col)
            if (isSafe(board, row, col)) {

                // Step 4: Place the queen
                board[row][col] = 'Q';

                // Step 5: Recur to place the rest of the queens
                nqueen(board, row + 1);

                // Step 6: Backtrack — remove the queen and try next column
                board[row][col] = 'X';
            }
        }
    }

    /**
     * Function to check whether a queen can be safely placed at (row, col)
     *
     * @param board - current board
     * @param row   - target row
     * @param col   - target column
     * @return true if safe, false otherwise
     */
    private static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;

        // ❌ Check the column above for any other queen
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // ❌ Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // ❌ Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        // ✅ Safe position for queen
        return true;
    }

    /**
     * Helper function to print the current chessboard configuration
     * when all queens are placed safely.
     */
    private static void printBoard(char[][] board) {
        int n = board.length;
        System.out.println("✅ One of the valid solutions:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
