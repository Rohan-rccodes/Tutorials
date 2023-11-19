public class basicprogram7048_121 {

    public static void main(String[] args) {
        System.out.println(findSmallest(5, 8, 1)); // 1
        System.out.println(findSmallest(9, 4, 6)); // 4
        System.out.println(findSmallest(3, 3, 3)); // 3
    }

    public static int findSmallest(int num1, int num2, int num3) {
        return Math.min(num1, Math.min(num2, num3));
    }
}