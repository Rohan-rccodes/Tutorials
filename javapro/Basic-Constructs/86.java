// Program to find maximum and minimum value in array.
import java.util.Scanner; 
class Bpc86{
    void sort(int arr1[]){
        int i,j,temp;
        for(i=0;i<arr1.length;i++){
            for(j=i+1;j<arr1.length;j++)
            if(arr1[i]>arr1[j]){
                temp=arr1[i];
                arr1[i]=arr1[j];
                arr1[j]=temp;
            }
            }
              System.out.println("Smallest Value Present in Array is : "+arr1[0]);
               System.out.println("Largest Value Present in Array is : "+arr1[(arr1.length-1)]);
            
    }
}
class b{
    public static void main(String str[]){
        Bpc86 obj=new Bpc86();
        Scanner sc=new Scanner(System.in); 
        int i;
        System.out.println("Enter the Size of Array : ");
        int s=sc.nextInt();
        int arr[]=new int[s];
        System.out.println("Enter Values in Array : ");
        for(i=0;i<arr.length;i++){
            System.out.println("At Index : "+i);
            arr[i]=sc.nextInt();
        }
        obj.sort(arr);
    }       
}
