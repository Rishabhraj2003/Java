package heaps.pq;

import java.util.*;

class Car {
    int x, y, dist;

    Car(int x, int y) {
        this.x = x;
        this.y = y;
        this.dist = x*x + y*y; // distance squared
    }
}

public class nearestcar{
    public static void main(String[] args) {

        int[][] points = {{3, 3}, {5, -1}, {-2, 4}, {1, 1}};
        int k = 2;

        PriorityQueue<Car> pq = new PriorityQueue<>((a, b) -> a.dist - b.dist);

        // add car objects
        for (int[] p : points) {
            pq.add(new Car(p[0], p[1]));
        }

        // remove first k nearest cars
        System.out.println("Nearest " + k + " cars:");
        for (int i = 0; i < k; i++) {
            Car c = pq.remove();
            System.out.println("(" + c.x + ", " + c.y + ")  distance = " + c.dist);
        }
    }
}
