package threading.threadcommunication;

class SleepDemo extends Thread {
    public void run() {
        System.out.println(getName() + " starts");
        try {
            Thread.sleep(2000); // Sleep 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " ends");
    }
}

public class sleep {
    public static void main(String[] args) {
        SleepDemo t1 = new SleepDemo();
        t1.start();
    }
}