class month_days
{
    public static void main(String arg[]) throws java.io.IOException
    {
        java.io.BufferedReader input= new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        System.out.println("Enter the month name : ");
        String month= input.readLine();
        month = month.toLowerCase();
        if(month.equals("february"))
        System.out.println(month+" has 28 days but, if it is from leap year then it will have 29 days ");
        else if(month.equals("january") || month.equals("march") || month.equals("may") || month.equals("july") || month.equals("august") || month.equals("october") || month.equals("december") )
        System.out.println(month+" has 31 days!!");    
        else if(month.equals("april") || month.equals("june") || month.equals("september") || month.equals("noverber"))
        System.out.println(month+" has 30 days!!");  
        else
        System.out.println("Kindly enter a valid month, "+month+" is not a valid month");    


    }

}