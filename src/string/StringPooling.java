package  string;
public class StringPooling {
    public static void main(String[] args) {

        // String literals -> stored in String Pool
        String s1 = "Hello";
        String s2 = "Hello";

        // String object using 'new' -> stored in heap
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        // Checking references
        System.out.println("s1 == s2 : " + (s1 == s2));   // true (same reference from pool)
        System.out.println("s1 == s3 : " + (s1 == s3));   // false (different object in heap)
        System.out.println("s3 == s4 : " + (s3 == s4));   // false (different heap objects)

        // Checking values using equals()
        System.out.println("s1.equals(s2) : " + s1.equals(s2)); // true
        System.out.println("s1.equals(s3) : " + s1.equals(s3)); // true
        System.out.println("s3.equals(s4) : " + s3.equals(s4)); // true

        // Interning a String (moving heap string to pool)
        String s5 = s3.intern();
        System.out.println("s1 == s5 : " + (s1 == s5));   // true (both point to pool object now)
    }
}
