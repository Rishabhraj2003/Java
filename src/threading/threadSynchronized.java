package threading;

class BankAccount {
    private int balance = 1000;

    // synchronized ensures thread-safe access
    public synchronized void withdraw(int amount) {
        if(balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " withdrawing " + amount);
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " new balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " insufficient balance!");
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class threadSynchronized {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> account.withdraw(700), "Thread-1");
        Thread t2 = new Thread(() -> account.withdraw(700), "Thread-2");

        t1.start();
        t2.start();
    }
}