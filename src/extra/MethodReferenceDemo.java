package extra;

import java.util.*;
import java.util.function.*;

public class MethodReferenceDemo {
    // 1️⃣ Static method
    public static void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // 2️⃣ Instance method
    public void printUpperCase(String str) {
        System.out.println(str.toUpperCase());
    }

    public static void main(String[] args) {

        // 1️⃣ Static method reference
        Consumer<String> greeter = MethodReferenceDemo::sayHello;
        greeter.accept("Rishabh");

        // 2️⃣ Instance method reference (specific object)
        MethodReferenceDemo demo = new MethodReferenceDemo();
        Consumer<String> toUpper = demo::printUpperCase;
        toUpper.accept("java rocks");

        // 3️⃣ Instance method reference (arbitrary object of a class)
        List<String> names = Arrays.asList("rishabh", "java", "lambda");
        names.forEach(String::toUpperCase); // <-- not printed yet
        names.forEach(System.out::println); // prints each name

        // 4️⃣ Constructor reference
        Supplier<List<String>> listSupplier = ArrayList::new;
        List<String> newList = listSupplier.get();
        newList.add("Method");
        newList.add("Reference");
        newList.forEach(System.out::println);
    }
}
