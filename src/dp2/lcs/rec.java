package dp2.lcs;

import java.util.Scanner;

public class rec {

    // Recursive function to compute the Longest Common Subsequence (LCS)
    public static int lcs(String str1, String str2, int n, int m) {

        // Base case: if either string length becomes 0, LCS is 0
        if (n == 0 || m == 0) {
            return 0;
        }

        // If the last characters match, include that character in LCS
        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            return lcs(str1, str2, n - 1, m - 1) + 1;
        } else {
            // If last characters do not match:
            // Either reduce string1 or reduce string2 and take the max result
            int option1 = lcs(str1, str2, n - 1, m);
            int option2 = lcs(str1, str2, n, m - 1);
            return Math.max(option1, option2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first string
        System.out.println("Enter the first string:");
        String str1 = sc.next();

        // Input second string
        System.out.println("Enter the second string:");
        String str2 = sc.next();

        // Call LCS function and print the result
        System.out.println("Length of LCS: " + lcs(str1, str2, str1.length(), str2.length()));
    }
}
