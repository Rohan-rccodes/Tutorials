class number
{
    public static void main(String arg[])throws java.io.IOException
    {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        // int num=1;
        // System.out.println("Enter numbers, to quit enter any non-numeric character : ");
        // while(true)
        // {   try
        //    {num= Integer.parseInt(input.readLine());}
        //    catch(java.lang.NumberFormatException a)
        //    {
        //        break;
        //    }
        //     if(num<0)
        //     negative ++;
        //     else if (num>0)
        //     positive++;
        //     else
        //     zeros++;
        // }



        Double num;
        String a="";
        System.out.println("Enter numbers, to quit enter q : ");
        while(true)
        {   try
           {
               a=input.readLine();
               num= Double.parseDouble(a); 
            }
            catch(java.lang.NumberFormatException e)
           {
               if(a.equals("q"))
               break;
               else continue;
           }
            if(num>max)
            max=num;
            if(num<min)
            min=num;
        }

    System.out.println("The maximum number was "+max);
    System.out.println("The minimum number was "+min);




    }
}