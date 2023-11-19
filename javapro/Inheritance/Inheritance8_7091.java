import java.util.Scanner;
class Shape {
    public Shape() {
    }
    public double getPerimeter() {
        System.out.println("Perimeter calculation for generic shape.");
        return 0.0;
    }
    public double getArea() {
        System.out.println("Area calculation for generic shape.");
        return 0.0;
    }
}
class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
class Shapetest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Perimeter of the circle: " + circle.getPerimeter());
        System.out.println("Area of the circle: " + circle.getArea());

        scanner.close();
    }
}
