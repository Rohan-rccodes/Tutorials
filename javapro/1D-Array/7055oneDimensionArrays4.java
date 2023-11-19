//Program to print the duplicate elements of an array.
class FindDuplicateElements{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 7, 3, 8, 8};
        findDuplicateElements(arr);
    }

    public static void findDuplicateElements(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] != -1) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.println("Duplicate element: " + arr[i]);
                        arr[j] = -1;
                    }
                }
            }
        }
    }
}
