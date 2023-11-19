import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class basicprograming91ArrayToArrayList7078 {
    public static void main(String[] args) {
        // Original array
        String[] originalArray = {"apple", "banana", "orange", "grape"};

        // Convert array to ArrayList
        List<String> arrayList = arrayToArrayList(originalArray);

        // Display the original array and the converted ArrayList
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Converted ArrayList: " + arrayList);
    }

    // Function to convert array to ArrayList
    private static <T> List<T> arrayToArrayList(T[] array) {
        List<T> arrayList = new ArrayList<>(Arrays.asList(array));
        return arrayList;
    }
}
