package thread_assignment;

class MyThread extends Thread {
    boolean running = true; 
    public void run() {
        while (running) {
            System.out.println("Thread is running...");
            try {
                Thread.sleep(500); 
            } catch (Exception e) {}
        }
        System.out.println("Thread ended.");
    }
}
public class Boolean_flag {
    public static void main(String[] args) {
        MyThread t = new MyThread(); 
        t.start(); 
        try {
            Thread.sleep(2000); 
        } catch (Exception e) {}
        t.running = false; 
        System.out.println("Main stopped the thread.");
    }
}