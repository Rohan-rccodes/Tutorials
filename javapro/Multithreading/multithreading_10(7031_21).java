class MyThread extends Thread {
    public MyThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    public void run() {
        System.out.println("Thread: " + getName() + ", Priority: " + getPriority() + " is running.");
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread1", Thread.MAX_PRIORITY);
        MyThread thread2 = new MyThread("Thread2", Thread.NORM_PRIORITY);
        MyThread thread3 = new MyThread("Thread3", Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
