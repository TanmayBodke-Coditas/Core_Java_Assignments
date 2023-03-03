package Assignment_16_Synchronisation;

class MyThread implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }
}
public class Question_1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        Thread thread3 = new Thread(t3);

        thread1.start();
        thread2.start();
        thread3.start();
    }

}

/*
Thread is running
Thread is running
Thread is running
 */