public class basicprogram7048_149{
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int n = arr.length;
        int key = 10;
        int result = binarySearch(arr, 0, n - 1, key);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + result);
    }

    public static int binarySearch(int[] arr, int l, int r, int key) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == key)
                return mid;

            if (arr[mid] > key)
                return binarySearch(arr, l, mid - 1, key);

            return binarySearch(arr, mid + 1, r, key);
        }
        return -1;
    }
}