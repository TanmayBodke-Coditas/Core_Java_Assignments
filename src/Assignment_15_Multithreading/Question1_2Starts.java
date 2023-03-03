package Assignment_15_Multithreading;

public class Question1_2Starts extends Thread{
    public void run(){
        System.out.println("Thread Runs.....");
    }

    public static void main(String[] args) {
        Question1_2Starts question12Starts = new Question1_2Starts();
        question12Starts.start();
        question12Starts.start();
    }
}

/*
It gives runtime exception becoz we already have run the thread and which gone in the dead state
and again we are starting the dead thread which is not possible.

Exception in thread "main" java.lang.IllegalThreadStateException
	at java.lang.Thread.start(Thread.java:708)
	at Assignment_15_Multithreading.Question1_2Starts.main(Question1_2Starts.java:11)
Thread Runs.....
 */