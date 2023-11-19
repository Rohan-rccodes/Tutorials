/* Write a java method to find the smallest number amoung three numbers. */

class function1{
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 17;
        int num3 = 5;

        int smallest = findSmallestNumber(num1, num2, num3);

        System.out.println("The smallest number is: " + smallest);
    }

    public static int findSmallestNumber(int num1, int num2, int num3) {
        int smallest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }

        if (num3 < smallest) {
            smallest = num3;
        }

        return smallest;
    }
}