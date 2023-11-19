
class evenodd
{
public static void main(String a[])
{
int i,ecount=0,ocount=0;
int[] arr = {5, 7, 2, 4, 9};
for(i=0;i<5;i++)
{
    if(arr[i]%2==0)
    {
        ecount++;
    }
    else{
        ocount++;
    }
}
System.out.println("Given Array: ");
for(i=0;i<5;i++)
{
    System.out.println(arr[i]);
}

System.out.println("No. of even numbers in array: "+ecount);
System.out.println("No. of odd number in  array: "+ocount);
}
}