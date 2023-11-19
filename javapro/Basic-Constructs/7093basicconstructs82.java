//sum of the values in an array

class sum
{
public static void main(String[] args){
int total=0;
int[] arr = {10,20,30,40,50};
int length = arr.length;
for(int i=0;i<length;i++){
total=total+arr[i];
}
System.out.println("sum of all the values in array="+total);
}
}