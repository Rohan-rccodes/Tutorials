public class pro9 extends Thread
{
  String task;
 
pro9(String task)
{
  this.task = task;
}
public void run()
{
 for(int i = 1; i <= 5; i++)
 {
  System.out.println(task+ " : " +i); 	
  try
 {
    Thread.sleep(1000); 
 }
 catch(InterruptedException ie) {
   System.out.println(ie.getMessage());	
  }
 } 
} 
public static void main(String[] args) 
{

  pro9 th1 = new pro9("Hello"); 
  pro9 th2 = new pro9("World.");

  Thread t1 = new Thread(th1);
  Thread t2 = new Thread(th2);
  t1.start();
  t2.start();
  }
}