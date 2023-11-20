class sampleThread extends Thread{
    public void run(){
        System.out.println("hello world");
    }
}



public class Multithreading_1{
  public static void main(String[] args) {
    sampleThread foo = new sampleThread();
    foo.run();
    
  }
}