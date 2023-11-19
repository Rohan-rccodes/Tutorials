/* Write a Java Program that sorts an array of integers using multiple threads. */

import java.util.Arrays;

class ParallelMergeSort {

    private final int[] array;

    private ParallelMergeSort(int[] array) {
        this.array = array;
    }

    private void merge(int low, int mid, int high) {
        int[] left = Arrays.copyOfRange(array, low, mid + 1);
        int[] right = Arrays.copyOfRange(array, mid + 1, high + 1);

        int i = 0, j = 0, k = low;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    private void mergeSort(int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            Thread leftThread = new Thread(() -> mergeSort(low, mid));
            Thread rightThread = new Thread(() -> mergeSort(mid + 1, high));

            leftThread.start();
            rightThread.start();

            try {
                leftThread.join();
                rightThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            merge(low, mid, high);
        }
    }

    private static void parallelMergeSort(int[] array) {
        ParallelMergeSort sorter = new ParallelMergeSort(array);
        sorter.mergeSort(0, array.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {12, 4, 7, 3, 9, 5, 2, 1, 6, 11, 8, 10};

        System.out.println("Array before sorting: " + Arrays.toString(arr));
        
        parallelMergeSort(arr);

        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}
