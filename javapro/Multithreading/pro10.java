public class pro10 implements Runnable
{
public void run()
{
  System.out.println(Thread.currentThread());
}
public static void main(String[] args) 
{
 pro10 a = new pro10();
 Thread t1 = new Thread(a, "Thread1");
  t1.setPriority(2);
 Thread t2 = new Thread(a, "Thread2");
  t2.setPriority(4);
 Thread t3 = new Thread(a, "Thread3");
  t3.setPriority(3);
 Thread t4 = new Thread(a, "Thread4");
  t4.setPriority(1);
 
 System.out.println("Priority of Thread: " +t2.getPriority());
 System.out.println("Name of Thread: " +t2.getName());
 t1.start();
t2.start(); 
t3.start(); 
t4.start();
  }
}