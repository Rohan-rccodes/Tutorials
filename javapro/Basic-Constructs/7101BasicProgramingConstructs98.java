  
  //Write a Java program to cyclically rotate a given array clockwise by one.


class CyclicRotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        
        System.out.println("Original Array:");
        printArray(array);
        
        rotateArrayClockwise(array);
        
        System.out.println("Array after cyclic rotation:");
        printArray(array);
    }
    
    public static void rotateArrayClockwise(int[] arr) {
        if (arr.length <= 1) {
            return; // No need to rotate for arrays with 0 or 1 element
        }
        
        int lastElement = arr[arr.length - 1];
        
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        
        arr[0] = lastElement;
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
