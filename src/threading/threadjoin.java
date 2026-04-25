package threading;

class PizzaPreparation extends Thread {
    public void run() {
        System.out.println("Preparing pizza...");
        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println("Pizza prepared!");
    }
}

class PizzaPacking extends Thread {
    private Thread dependency;

    PizzaPacking(Thread dependency) {
        this.dependency = dependency;
    }

    public void run() {
        try {
            dependency.join(); // Wait until pizza is prepared
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Packing pizza...");
        try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println("Pizza packed!");
    }
}

class PizzaDelivery extends Thread {
    private Thread dependency;

    PizzaDelivery(Thread dependency) {
        this.dependency = dependency;
    }

    public void run() {
        try {
            dependency.join(); // Wait until pizza is packed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Delivering pizza...");
        try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println("Pizza delivered!");
    }
}

public class threadjoin {
    public static void main(String[] args) {
        PizzaPreparation prep = new PizzaPreparation();
        PizzaPacking pack = new PizzaPacking(prep);
        PizzaDelivery deliver = new PizzaDelivery(pack);

        prep.start();
        pack.start();
        deliver.start();
    }
}