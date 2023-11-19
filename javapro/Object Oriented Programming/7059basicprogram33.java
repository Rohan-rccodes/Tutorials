import java.util.Scanner;

class PrismArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the base area of the prism: ");
        double baseArea = scanner.nextDouble();
        
        System.out.print("Enter the height of the prism: ");
        double height = scanner.nextDouble();
        
        double lateralArea = 2 * baseArea;
        double basePerimeter = Math.sqrt(baseArea) * 4;
        double totalArea = lateralArea + basePerimeter * height;
        
        System.out.println("The area of the prism is: " + totalArea);
        
        scanner.close();
    }
}
