// yeild ()
public class pro13 extends Thread  
{  
    public void run()  
    {  
        for (int i=0; i<3 ; i++)  
            System.out.println(Thread.currentThread().getName() + " in control");  
    }  
    public static void main(String[]args)  
    {  
        pro13 t1 = new pro13();  
        pro13 t2 = new pro13();  
      
        t1.start();  
        t2.start();  
        for (int i=0; i<3; i++)  
        {  
            t1.yield();  
            System.out.println(Thread.currentThread().getName() + " in control");  
        }  
    }  
}  
//join() 
public class pro13 extends Thread
{
	public void run()
   	{
       		System.out.println("r1 ");
       		try {
        		Thread.sleep(500);
    		}catch(InterruptedException ie){ }
       		System.out.println("r2 ");
  	}
	public static void main(String[] args)
	{
		pro13 t1=new pro13();
		pro13 t2=new pro13();
		t1.start();

		try{
  			t1.join();	//Waiting for t1 to finish
		}catch(InterruptedException ie){}

		t2.start();
	}
}