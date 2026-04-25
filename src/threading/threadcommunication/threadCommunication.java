package threading;

import java.util.LinkedList;
import java.util.Queue;

// Shared Resource
class Store {
    private Queue<String> products = new LinkedList<>();
    private final int capacity = 2;

    public synchronized void produce(String product) throws InterruptedException {
        while(products.size() == capacity) {
            wait(); // wait if store full
        }
        products.add(product);
        System.out.println("Produced: " + product);
        notify(); // notify consumer
    }

    public synchronized void consume() throws InterruptedException {
        while(products.isEmpty()) {
            wait(); // wait if store empty
        }
        String product = products.poll();
        System.out.println("Consumed: " + product);
        notify(); // notify producer
    }
}

// Producer Thread
class Producer extends Thread {
    private Store store;
    Producer(Store store) { this.store = store; }

    public void run() {
        String[] items = {"Apple", "Banana", "Orange", "Grapes"};
        try {
            for(String item : items) {
                store.produce(item);
                Thread.sleep(500); // simulate time to produce
            }
        } catch(InterruptedException e) { e.printStackTrace(); }
    }
}

// Consumer Thread
class Consumer extends Thread {
    private Store store;
    Consumer(Store store) { this.store = store; }

    public void run() {
        try {
            for(int i=0;i<4;i++) {
                store.consume();
                Thread.sleep(800); // simulate time to consume
            }
        } catch(InterruptedException e) { e.printStackTrace(); }
    }
}

public class threadCommunication {
    public static void main(String[] args) {
        Store store = new Store();
        Producer p = new Producer(store);
        Consumer c = new Consumer(store);

        p.start();
        c.start();
    }
}