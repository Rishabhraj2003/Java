package heaps.pq;

import java.util.PriorityQueue;

public class main {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq=new PriorityQueue<>();

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
