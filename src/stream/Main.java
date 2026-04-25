package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Create a list
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30);

        System.out.println("Original List: " + numbers);

        // Use Stream to process data
        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)        // 1️⃣ filter even numbers
                .map(n -> n * n)                // 2️⃣ square each number
                .sorted()                       // 3️⃣ sort them
                .collect(Collectors.toList());  // 4️⃣ collect result into list

        // Print result
        System.out.println("Processed List (Even Numbers Squared & Sorted): " + result);
    }
}

