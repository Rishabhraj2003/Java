package string;
import java.util.*;

public class implemation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.println("Enter a string:");
        String str1 = sc.nextLine();

        // Creating strings in different ways
        String str2 = "Hello";                  // String literal
        String str3 = new String("World");      // Using new keyword

        System.out.println("\n=== String Implementations ===");
        System.out.println("String literal: " + str2);
        System.out.println("String object: " + str3);

        // Various String functions
        System.out.println("\n=== String Functions ===");
        System.out.println("Original String: " + str1);
        System.out.println("Length: " + str1.length());
        System.out.println("Character at index 2: " + str1.charAt(2));
        System.out.println("Substring(2,5): " + str1.substring(2, 5));
        System.out.println("Concatenation: " + str1.concat(" JAVA"));
        System.out.println("To Uppercase: " + str1.toUpperCase());
        System.out.println("To Lowercase: " + str1.toLowerCase());
        System.out.println("Trim (remove spaces): '" + str1.trim() + "'");
        System.out.println("Starts with 'He': " + str1.startsWith("He"));
        System.out.println("Ends with 'va': " + str1.endsWith("va"));
        System.out.println("Index of 'a': " + str1.indexOf('a'));
        System.out.println("Last Index of 'a': " + str1.lastIndexOf('a'));
        System.out.println("Replace 'a' with 'x': " + str1.replace('a', 'x'));
        System.out.println("Contains 'Java': " + str1.contains("Java"));
        System.out.println("Equals 'JAVA': " + str1.equals("JAVA"));
        System.out.println("Equals Ignore Case 'JAVA': " + str1.equalsIgnoreCase("JAVA"));

        // Splitting string
        String str4 = "Java,Python,C++,HTML";
        String[] langs = str4.split(",");
        System.out.println("\nSplit String Example:");
        for (String lang : langs) {
            System.out.println(lang);
        }
    }
}
