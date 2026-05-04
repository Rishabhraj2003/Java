package collections.listinterface;

import java.util.*;

public class list{
    public static void main(String[] args) {

        // 1. Creating List
        List<String> list = new ArrayList<>();

        // 2. add()
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        System.out.println("After add: " + list);

        // 3. add(index, element)
        list.add(1, "Orange");
        System.out.println("After inserting at index 1: " + list);

        // 4. get()
        System.out.println("Element at index 2: " + list.get(2));

        // 5. set()
        list.set(2, "Grapes");
        System.out.println("After update: " + list);

        // 6. remove()
        list.remove("Apple");
        list.remove(0);
        System.out.println("After remove: " + list);

        // 7. size()
        System.out.println("Size: " + list.size());

        // 8. contains()
        System.out.println("Contains Mango? " + list.contains("Mango"));

        // 9. isEmpty()
        System.out.println("Is Empty? " + list.isEmpty());

        // 10. addAll()
        List<String> list2 = new ArrayList<>();
        list2.add("Pineapple");
        list2.add("Kiwi");

        list.addAll(list2);
        System.out.println("After addAll: " + list);

        // 11. removeAll()
        list.removeAll(list2);
        System.out.println("After removeAll: " + list);

        // 12. retainAll()
        list.add("Apple");
        list.add("Banana");

        list.retainAll(Arrays.asList("Banana"));
        System.out.println("After retainAll: " + list);

        // 13. indexOf() and lastIndexOf()
        list.add("Banana");
        System.out.println("First index of Banana: " + list.indexOf("Banana"));
        System.out.println("Last index of Banana: " + list.lastIndexOf("Banana"));

        // 14. iteration using for-each
        System.out.println("For-each loop:");
        for(String item : list) {
            System.out.println(item);
        }

        // 15. iterator()
        System.out.println("Iterator:");
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // 16. ListIterator (forward + backward)
        System.out.println("ListIterator forward:");
        ListIterator<String> lit = list.listIterator();

        while(lit.hasNext()) {
            System.out.println(lit.next());
        }

        System.out.println("ListIterator backward:");
        while(lit.hasPrevious()) {
            System.out.println(lit.previous());
        }

        // 17. subList()
        list.add("Mango");
        list.add("Orange");

        List<String> sub = list.subList(0, 2);
        System.out.println("SubList: " + sub);

        // 18. sort()
        list.sort(String::compareTo);
        System.out.println("Sorted list: " + list);

        // 19. clear()
        list.clear();
        System.out.println("After clear: " + list);

        // 20. isEmpty() again
        System.out.println("Is Empty after clear? " + list.isEmpty());
    }
}