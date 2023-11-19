 class p21 
 {
  public static void main(String[] args) {
   
    int[] arr = {1, 2, 3, 4, 5};
    
   
    System.out.println("Original array: " + java.util.Arrays.toString(arr));
    
    
    int[] a = swapFirstLast(arr);
    

    System.out.println("New array: " + java.util.Arrays.toString(a));
  }
  
 
  public static int[] swapFirstLast(int[] arr) {
   
    if (arr == null || arr.length == 0) {
      return arr; 
    }
    
    
    int[] a = new int[arr.length];
    
    
    System.arraycopy(arr, 0, a, 0, arr.length);
    
    
    int temp = a[0];
    a[0] = a[arr.length - 1];
    a[arr.length - 1] = temp;
    
    
    return a;
  }
}

