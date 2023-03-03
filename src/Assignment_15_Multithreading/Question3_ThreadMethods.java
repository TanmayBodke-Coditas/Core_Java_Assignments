package Assignment_15_Multithreading;

class Test3 implements Runnable{

    @Override
    public void run() {
        System.out.println("Priority of "+ Thread.currentThread().getName()
                + " is: " + Thread.currentThread().getPriority());    }
}
public class Question3_ThreadMethods {
    public static void main(String[] args) {
        Test3 test31= new Test3();
        Test3 test32= new Test3();
        Test3 test33= new Test3();

        Thread thread1=new Thread(test31);
        Thread thread2=new Thread(test31);
        Thread thread3=new Thread(test31);


        System.out.println("before starting thread1 isAlive: "+thread1.isAlive());
        System.out.println("before starting thread2 isAlive: "+thread2.isAlive());
        System.out.println("before starting thread3 isAlive: "+thread3.isAlive());
        System.out.println();

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread1.setName("thread-1");

        thread2.setPriority(Thread.MIN_PRIORITY);
        thread2.setName("thread-2");

        thread3.setPriority(Thread.NORM_PRIORITY);
        thread3.setName("thread-3");


        thread1.start();
        thread2.start();
        thread3.start();


        System.out.println("after starting thread1 isAlive: "+thread1.isAlive());
        System.out.println("after starting thread2 isAlive: "+thread2.isAlive());
        System.out.println("after starting thread3 isAlive: "+thread3.isAlive());
        System.out.println();

        Thread.State state = Thread.currentThread().getState();
        System.out.println("State of Thread : "+ state);


    }
}


/*
before starting thread1 isAlive: false
before starting thread2 isAlive: false
before starting thread3 isAlive: false
Priority of thread-1 is: 10
after starting thread1 isAlive: false
after starting thread2 isAlive: true
after starting thread3 isAlive: true
Priority of thread-3 is: 5
State of Thread : RUNNABLE
Priority of thread-2 is: 1
Process finished with exit code 0
*/