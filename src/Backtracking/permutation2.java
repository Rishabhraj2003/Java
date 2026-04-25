package Backtracking;

import java.util.ArrayList;

public class permutation2 {

    // 🔁 Recursive function to generate all permutations
    public static void getPermutations(String str, String current, ArrayList<ArrayList<Character>> result) {

        // 🛑 Base case: if string is empty, store the current permutation
        if (str.equals("")) {
            // Convert the current string (like "abc") into ArrayList<Character> [a, b, c]
            ArrayList<Character> perm = new ArrayList<>();
            for (char ch : current.toCharArray()) {
                perm.add(ch);
            }
            result.add(perm); // ✅ Add this permutation list to the final result
            return;
        }

        // 🔁 Try each character one by one
        for (int i = 0; i < str.length(); i++) {

            // 🎯 Pick one character
            char ch = str.charAt(i);

            // ✂️ Break string into left and right parts (excluding the chosen char)
            String left = str.substring(0, i);
            String right = str.substring(i + 1);

            // 🧩 Remaining string after removing the chosen character
            String rem = left + right;

            // 🚀 Recursive call with the remaining string and current + chosen char
            getPermutations(rem, current + ch, result);
        }
    }

    public static void main(String[] args) {
        String str = "abc";

        // ✅ Create a list to store all permutations (each permutation = list of characters)
        ArrayList<ArrayList<Character>> allPermutations = new ArrayList<>();

        // 🎯 Generate all permutations
        getPermutations(str, "", allPermutations);

        // 🖨️ Print all stored permutations
        System.out.println("All permutations of '" + str + "':");
        for (ArrayList<Character> perm : allPermutations) {
            System.out.println(perm);
        }
    }
}
