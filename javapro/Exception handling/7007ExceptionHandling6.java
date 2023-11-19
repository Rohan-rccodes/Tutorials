/* Write a Java Program that reads a list of integers from the user and throws an exception if any numbers are duplicates.*/ 

import java.util.*;



class DuplicateChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter " + n + " integers:");

        try {
            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();
                if (numbers.contains(num)) {
                    throw new DuplicateNumberException("Duplicate number found: " + num);
                }
                numbers.add(num);
            }
            System.out.println("No duplicates found!");
        } catch (DuplicateNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}