package heaps.pq;

import java.util.Comparator;
import java.util.PriorityQueue;

public class object {

    // Student class that implements Comparable so PriorityQueue knows how to compare objects
    static class Students implements Comparable<Students> {
        String name;
        int marks;

        // Constructor to initialize student object
        public Students(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        // This method defines natural ordering (ascending order of marks)
        @Override
        public int compareTo(Students s2) {
            return this.marks - s2.marks;   // smaller marks → higher priority
        }

        // for printing Student objects
        @Override
        public String toString() {
            return name + " (" + marks + ")";
        }
    }

    public static void main(String[] args) {

        // PriorityQueue that stores Student objects in ascending order of marks
        PriorityQueue<Students> pq = new PriorityQueue<>();

        // Adding student objects to priority queue
        pq.add(new Students("Rohan", 90));
        pq.add(new Students("Aman", 80));
        pq.add(new Students("Neha", 95));
        pq.add(new Students("Karan", 85));

        // Removing and printing students in priority order (smallest marks first)
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
