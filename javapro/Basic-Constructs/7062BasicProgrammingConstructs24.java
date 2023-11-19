import java.io.*;
class palindrome
{
public static void main(String a[]) throws IOException
{
int num,temp,sum=0,r;
System.out.println("Enter any number:");
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
num = Integer.parseInt(br.readLine());
temp=num;
if(num>0)
{
while(num>0)
{    
r=num%10;  
sum=(sum*10)+r;    
num=num/10;    
}    
if(temp==sum)    
{
System.out.println(temp+" is palindrome number... ");    
}
else    
{  
System.out.println(temp+ " is not palindrome number...");    
}  
}
else
{
    System.out.println("Enter any positive number.");
}
    
}
}