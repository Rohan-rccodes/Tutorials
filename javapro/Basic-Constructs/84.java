/*Write a Java program to calculate the average value of array elements */
import java.util.Scanner;

public class program84_7024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        double average = calculateAverage(array);

        System.out.println("The average value of the array elements is: " + average);
    }

    public static double calculateAverage(int[] array) {
        int sum = 0;

        for (int num : array) {
            sum += num;
        }

        return (double) sum / array.length;
    }
}
