package threading.threadcommunication;
class YieldDemo extends Thread {
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println(getName() + " running: " + i);
            Thread.yield(); // Suggest scheduler to pause
        }
    }
}

public class Yeild{
    public static void main(String[] args) {
        YieldDemo t1 = new YieldDemo();
        YieldDemo t2 = new YieldDemo();
        t1.start();
        t2.start();
    }
}