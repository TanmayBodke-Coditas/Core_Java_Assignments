package Assignment_16_Synchronisation;

import java.util.ArrayList;
import java.util.List;

public class Question3_ProducerConsumer {

    private static final int BUFFER_SIZE = 10;
    private static List<Integer> buffer = new ArrayList<>(BUFFER_SIZE);

    public static void main(String[] args) {
        Thread producerThread = new Thread(new Producer());
        Thread consumerThread = new Thread(new Consumer());

        producerThread.start();
        consumerThread.start();
    }


    private static class Producer implements Runnable {
        public void run() {
            while (true) {
                synchronized (buffer) {
                    while (buffer.size() == BUFFER_SIZE) {
                        try {
                            buffer.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    int data = (int) (Math.random() * 100);
                    buffer.add(data);
                    System.out.println("Produced " + data);
                    buffer.notifyAll();
                }
            }
        }
    }

    private static class Consumer implements Runnable {
        public void run() {
            while (true) {
                synchronized (buffer) {
                    while (buffer.isEmpty()) {
                        try {
                            buffer.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    int data = buffer.remove(0);
                    System.out.println("Consumed " + data);
                    buffer.notifyAll();
                }
            }
        }
    }

}