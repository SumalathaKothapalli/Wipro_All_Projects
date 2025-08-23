package thread_assignment;

class BankAccount {
    int balance = 1000;
}

public class Bank_account {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        Thread t1 = new Thread() {
            public void run() {
                synchronized (acc) {
                    acc.balance += 500;
                    System.out.println("Thread 1 deposited. Balance: " + acc.balance);

                    acc.balance -= 200;
                    System.out.println("Thread 1 withdrew. Balance: " + acc.balance);
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                synchronized (acc) {
                    acc.balance -= 300;
                    System.out.println("Thread 2 withdrew. Balance: " + acc.balance);
                }
            }
        };

        t1.start();
        t2.start();
    }
}