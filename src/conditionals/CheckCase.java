package conditionals;
import java.util.Scanner;
public class CheckCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Check if the string is empty
        if (str.isEmpty()) {
            System.out.println("You entered an empty string.");
        } else {
            char firstChar = str.charAt(0);

            // Check if first character is uppercase or lowercase
            if (Character.isUpperCase(firstChar)) {
                System.out.println("The first character '" + firstChar + "' is uppercase.");
            } else if (Character.isLowerCase(firstChar)) {
                System.out.println("The first character '" + firstChar + "' is lowercase.");
            } else {
                System.out.println("The first character '" + firstChar + "' is not an alphabet.");
            }
        }

        sc.close();
    }
}
