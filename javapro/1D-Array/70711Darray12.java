class ArraySum {
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

     
        System.out.println("Original Array:");
        displayArray(array);

       
        int sum = calculateArraySum(array);
        
        System.out.println("Sum of all elements in the array: " + sum);
    }

    
    private static int calculateArraySum(int[] arr) {
        int sum = 0;

       
        for (int num : arr) {
            sum += num;
        }

        return sum;
    }


    private static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}