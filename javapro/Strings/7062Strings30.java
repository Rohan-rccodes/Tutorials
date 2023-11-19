class  spro3
{
    public static void main(String st[])
    {
        String str= new String( "Java is platform independent. ");
        int c=0;
        System.out.println("String is :"+str);

       int n= str.length();
       for(int i=0; i<n;i++)
       {
        char s= str.charAt(i);
        if(s==' ')
          {
            c++;
          }
       }
       System.out.print("No. of words in String :"+ (c));
    }
}