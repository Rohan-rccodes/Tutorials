class Conversion {
    public static void main(String[] args) {
        int x = 10;              
        double y = x;  

        System.out.println("Original int value: " + x);
        System.out.println("Converted double value: " + y);
        double square = y * y;
        System.out.println("Square of the converted double value: " + square);
    }
}
