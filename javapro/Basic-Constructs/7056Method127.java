     /*Java method to find area of pentagon */
class Method127 {
       public static void main(String[] args) {
        double sideLength = 7.5; // Length of a side of the pentagon
        double area = calculatePentagonArea(sideLength);
        System.out.println("Area of the pentagon: " + area);
    }

    public static double calculatePentagonArea(double sideLength) {
        int sides = 5; // Number of sides in a pentagon
        double numerator = 0.25 * sides * Math.pow(sideLength, 2);
        double denominator = Math.tan(Math.PI / sides);
        return numerator / denominator;
    }
}


