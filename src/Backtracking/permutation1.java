package Backtracking;

public class permutation1 {

    // Recursive function to print all permutations of 'str'
    // 't' stores the current permutation being built
    public static void print(String str, String t) {

        // Base case: when no characters are left in str
        if (str.equals("")) {
            System.out.println(t);  // print the formed permutation
            return;
        }

        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++) {

            // Pick the current character
            char ch = str.charAt(i);

            // Divide string into left and right parts (excluding the current character)
            String left = str.substring(0, i);
            String right = str.substring(i + 1);

            // Remaining string after removing the chosen character
            String rem = left + right;

            // Recursive call: fix the current character and permute the rest
            print(rem, t + ch);
        }
    }

    public static void main(String[] args) {
        String str = "abc";  // input string
        print(str, "");      // initial call with empty result string
    }
}
