package collections;

import java.util.*;

public class CollectionInterface {
    public static void main(String[] args) {

        // Creating a Collection using ArrayList
        Collection<Integer> c = new ArrayList<>();

        // ---------------- BASIC ADD ----------------
        // add(E e) → Adds element to collection, returns true if successful
        c.add(1);
        c.add(2);
        c.add(3);
        System.out.println("Initial Collection: " + c);

        // ---------------- SIZE & EMPTY ----------------
        // size() → Returns number of elements
        System.out.println("Size: " + c.size());

        // isEmpty() → Checks if collection is empty
        System.out.println("Is Empty: " + c.isEmpty());

        // ---------------- SEARCH OPERATIONS ----------------
        // contains(Object o) → Checks if element exists (uses equals())
        System.out.println("Contains 2? " + c.contains(2));
        System.out.println("Contains 10? " + c.contains(10));

        // containsAll(Collection<?> c) → Checks if all elements exist
        System.out.println("Contains [1,2]? " + c.containsAll(List.of(1, 2)));

        // ---------------- CONVERSION ----------------
        // toArray() → Converts to Object array
        Object[] objArray = c.toArray();
        System.out.println("Object Array:");
        for (Object o : objArray) {
            System.out.println(o);
        }

        // toArray(T[] a) → Converts to typed array
        Integer[] intArray = c.toArray(new Integer[0]);
        System.out.println("Integer Array:");
        for (Integer i : intArray) {
            System.out.println(i);
        }

        // ---------------- REMOVE OPERATIONS ----------------
        // remove(Object o) → Removes first occurrence
        c.remove(3);
        System.out.println("After removing 3: " + c);

        // removeAll(Collection<?> c) → Removes all matching elements
        c.addAll(List.of(3, 4, 5));
        System.out.println("Before removeAll: " + c);

        c.removeAll(List.of(3, 4));
        System.out.println("After removeAll [3,4]: " + c);

        // retainAll(Collection<?> c) → Keeps only common elements (intersection)
        c.retainAll(List.of(1, 5));
        System.out.println("After retainAll [1,5]: " + c);

        // ---------------- ADD MULTIPLE ----------------
        // addAll(Collection<? extends E> c) → Adds all elements
        c.addAll(List.of(10, 20, 30));
        System.out.println("After addAll: " + c);

        // ---------------- ITERATION ----------------
        // Using Iterator
        System.out.println("Using Iterator:");
        Iterator<Integer> it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // ---------------- CLEAR ----------------
        // clear() → Removes all elements
        c.clear();
        System.out.println("After clear: " + c);

        // ---------------- EQUALITY ----------------
        Collection<Integer> c1 = new ArrayList<>(List.of(1, 2, 3));
        Collection<Integer> c2 = new ArrayList<>(List.of(1, 2, 3));

        // equals() → Checks if two collections are equal
        System.out.println("c1 equals c2? " + c1.equals(c2));

        // ---------------- HASHCODE ----------------
        // hashCode() → Returns hash code of collection
        System.out.println("HashCode of c1: " + c1.hashCode());

        // ---------------- OPTIONAL: STREAM (Modern Java) ----------------
        // stream() → Used for functional operations
        System.out.println("Using Stream (print elements):");
        c1.stream().forEach(System.out::println);
    }
}