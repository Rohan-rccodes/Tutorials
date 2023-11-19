class Matrix_add
{
    public static void main(String arg[])throws java.io.IOException
    {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        System.out.println("Enter the Size of matrices");
        System.out.println("Enter number of rows : ");
        int rows = Integer.parseInt(input.readLine());
        System.out.println("Enter number of columns : ");
        int cols = Integer.parseInt(input.readLine());
        int[][] arr1,arr2;
        arr1= new int[rows][cols];
        arr2= new int[rows][cols];
        System.out.println("Enter the elements of first matrix :");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {   System.out.println("Enter for position "+i+" "+j);
                arr1[i][j]=Integer.parseInt(input.readLine());
            }
        }

        System.out.println("Enter the elements of second matrix :");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {   System.out.println("Enter for position "+i+" "+j);
                arr2[i][j]=Integer.parseInt(input.readLine());
            }
        }

    System.out.println("Given matrices are : ");
    System.out.println("Matrix-1");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            System.out.print(arr1[i][j]+" ");
            System.out.println();
        }
        System.out.println("\nMatrix-2");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            System.out.print(arr2[i][j]+" ");
            System.out.println();
        }

        System.out.println("Sum of the matrices : ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {arr1[i][j] += arr2[i][j];
            System.out.print(arr1[i][j]+" ");}
            System.out.println();
        }
    }
}