class Std {
      public void print(){
            System.out.println("Student details.");
      }
}
 
class ClgStd extends Std {
      public void print(){
            System.out.println("College Student details.");
      }

      public static void main(String s[]){
  
       Std a = new ClgStd();
        a.print();
  }
}