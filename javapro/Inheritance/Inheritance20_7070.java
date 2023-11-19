// Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume() and calculateSurfaceArea(). Create subclasses Sphere and Cube that extend the Shape3D class and implement the respective methods to calculate the volume and surface area of each shape. (Program 20)
// Created by Aryan , Rollno 7070
// Note : In order to compile and run this program , rename it from "7070Inheritance20.java" to "Inheritance20.java"

// Abstract class Shape3D
abstract class Shape3D {
    // Abstract methods to calculate volume and surface area
    public abstract double calculateVolume();
    public abstract double calculateSurfaceArea();
}

// Subclass Sphere extending Shape3D
class Sphere extends Shape3D {
    private double radius;

    // Constructor for Sphere
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Implementation of abstract method to calculate volume for Sphere
    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Implementation of abstract method to calculate surface area for Sphere
    @Override
    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}

// Subclass Cube extending Shape3D
class Cube extends Shape3D {
    private double side;

    // Constructor for Cube
    public Cube(double side) {
        this.side = side;
    }

    // Implementation of abstract method to calculate volume for Cube
    @Override
    public double calculateVolume() {
        return Math.pow(side, 3);
    }

    // Implementation of abstract method to calculate surface area for Cube
    @Override
    public double calculateSurfaceArea() {
        return 6 * Math.pow(side, 2);
    }
}

// Main class for testing
public class Inheritance20_7070 {
    public static void main(String[] args) {
        // Create instances of Sphere and Cube
        Sphere sphere = new Sphere(5.0);
        Cube cube = new Cube(3.0);

        // Display volume and surface area for Sphere
        System.out.println("Sphere:");
        System.out.println("Volume: " + sphere.calculateVolume());
        System.out.println("Surface Area: " + sphere.calculateSurfaceArea());
        System.out.println();

        // Display volume and surface area for Cube
        System.out.println("Cube:");
        System.out.println("Volume: " + cube.calculateVolume());
        System.out.println("Surface Area: " + cube.calculateSurfaceArea());
    }
}
