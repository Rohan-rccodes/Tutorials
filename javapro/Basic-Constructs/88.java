// Program to Reverse a array.
import java.util.Scanner;
class Bpc88{
    void rev(int arr1[]){
         int i,j,temp;
         for(i=0;i<arr1.length;i++){
            for(j=i+1;j<arr1.length;j++){
                temp=arr1[i];
                arr1[i]=arr1[j];
                arr1[j]=temp;
            }
         }
          System.out.println("Your Array in Reverse -> ");
         for(i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);

    }
}
}
class b{
    public static void main(String str[]){
    Bpc88 obj =new Bpc88();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Size of the Array : ");
    int s=sc.nextInt();
     System.out.println("Enter Values in Array : ");
     int arr[]=new int[s];
     for(int i=0;i<s;i++){
        System.out.println("Enter at Index : "+i);
        arr[i]=sc.nextInt();
     }
      obj.rev(arr);
}
}