package arrays;
import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Insert");
            System.out.println("2. Display");
            System.out.println("3. Search");
            System.out.println("4. Update");
            System.out.println("5. Delete");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1: // Insert
                    System.out.print("Enter number to insert: ");
                    int num = sc.nextInt();
                    list.add(num);
                    System.out.println("Element inserted.");
                    break;

                case 2: // Display
                    System.out.println("ArrayList: " + list);
                    break;

                case 3: // Search
                    System.out.print("Enter number to search: ");
                    int search = sc.nextInt();
                    if (list.contains(search)) {
                        System.out.println("Found at index: " + list.indexOf(search));
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;

                case 4: // Update
                    System.out.print("Enter index to update: ");
                    int idx = sc.nextInt();
                    if (idx >= 0 && idx < list.size()) {
                        System.out.print("Enter new value: ");
                        int newVal = sc.nextInt();
                        list.set(idx, newVal);
                        System.out.println("Element updated.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 5: // Delete
                    System.out.print("Enter index to delete: ");
                    int delIdx = sc.nextInt();
                    if (delIdx >= 0 && delIdx < list.size()) {
                        list.remove(delIdx);
                        System.out.println("Element deleted.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 6: // Exit
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
