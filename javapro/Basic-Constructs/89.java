// 89.Write a java program to find the common elements between 2 arrays.    By Aryan chugh (7058/21)
import java.util.Arrays; 
 class commonelement{
public static void main(String[] args) 
    {
      int[] array1 = {130, 250, 530, 560, 890, 943, 987, 1000};
      int[] array2 = {125, 560,5, 6, 4, 987,1000};
 
       System.out.println("Array1 : "+Arrays.toString(array1));
       System.out.println("Array2 : "+Arrays.toString(array2));
 
      
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i] == (array2[j]))
                {
                 
                 System.out.println("Common element is : "+(array1[i]));
                 }
            }
        }
 
    }
}
