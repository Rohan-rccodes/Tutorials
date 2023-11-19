/* Write a Java Program to Sort the Array in an Ascending Order*/

import java.util.Arrays;
public class program100_7024 {
    public static void main(String[] args) {
        int[] array = {7,4,21,3,0,3};

        System.out.println("Original array: " + Arrays.toString(array));

        sortArray(array);

        System.out.println("Sorted array in ascending order: " + Arrays.toString(array));
    }

    public static void sortArray(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
