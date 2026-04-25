package  exception2.java;
import java.util.*;

// 🔷 Custom Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class Bank {

    int balance = 5000;

    // 🔷 Method declaring exception
    void withdraw(int amount) throws InsufficientBalanceException {

        // 🔷 Condition where we manually throw exception
        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance!");
        }

        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}

public class customexp{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();

        System.out.println("Enter amount to withdraw:");
        int amount = sc.nextInt();

        try {
            b.withdraw(amount);
        }

        // 🔷 Handling custom exception
        catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        finally {
            System.out.println("Transaction completed.");
            sc.close();
        }
    }
}