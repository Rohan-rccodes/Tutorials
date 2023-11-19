import java.util.Scanner;
class a {
    public static void main(String[] x) 
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of elements of array: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) 
        {
            System.out.println("Enter the element at index : "+i);
            arr[i] = s.nextInt();
        }

        System.out.println("Enter the element to find: ");
        int target = s.nextInt();

        int index = findElement(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    public static int findElement(int[] array, int target) 
    {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
