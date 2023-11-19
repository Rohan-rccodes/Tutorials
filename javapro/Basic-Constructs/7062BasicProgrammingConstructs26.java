class sum
{
    public static void main(String st[])
    {
        int num=12345,sum=0,temp;
        temp=num;
        while(num!=0)
            {
                sum=sum+num%10;
                num=num/10;
            }
            System.out.println("Sum of all digits  in the "+temp+" is "+sum);
          

    }
}