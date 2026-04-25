package conditionals;
import java.util.*;
public class CollegeInfo {

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        // Input year
        System.out.print("Enter your year (1 to 4): ");
        int year = sc.nextInt();
        sc.nextLine(); // consume newline

        // Input department
        System.out.print("Enter your department (CSE, ECE, MECH, CIVIL): ");
        String dept = sc.nextLine().toUpperCase();

        switch (year) {
            case 1:
                System.out.println("You are in 1st year. All departments have common syllabus.");
                break;

            case 2:
            case 3:
            case 4:
                switch (dept) {
                    case "CSE":
                        System.out.println("You are in " + year + " year of Computer Science Engineering.");
                        break;
                    case "ECE":
                        System.out.println("You are in " + year + " year of Electronics and Communication Engineering.");
                        break;
                    case "MECH":
                        System.out.println("You are in " + year + " year of Mechanical Engineering.");
                        break;
                    case "CIVIL":
                        System.out.println("You are in " + year + " year of Civil Engineering.");
                        break;
                    default:
                        System.out.println("Invalid department entered.");
                }
                break;

            default:
                System.out.println("Invalid year entered.");
        }

        sc.close();
    }
}
