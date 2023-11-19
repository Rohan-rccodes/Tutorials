 
 //Write a java program to test if an array specific value

class A
{


      public static void main(String a[])
	{
            int[] array={1,2,3,4,5,6};
	    int checkvalue=4;
	    boolean containvalue=false;
              
		for(int value:array)
		{
                   if(value==checkvalue)
		   {
			containvalue=true;
			break;
		   }  
		}
           
             if(containvalue)
	     {
		System.out.println("The array contains the value "+checkvalue);
	     }
	     else
	     {
		System.out.println("The array dose not contains the value "+checkvalue);
	     }
	}

}