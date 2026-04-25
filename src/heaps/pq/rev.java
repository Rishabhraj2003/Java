package heaps.pq;

import java.util.Comparator;
import java.util.PriorityQueue;

public class rev {
    public static void main(String[] args) {
        // pq in the reverse order
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(12);
        pq.add(2);
        pq.add(43);
        pq.add(1);

        System.out.println("The priroity queue is ");
        System.out.println(pq);

        System.out.println("Deleting the elements");
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
