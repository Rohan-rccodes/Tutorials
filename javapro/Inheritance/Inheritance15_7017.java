// Define the abstract class Animal
abstract class Animal {
    abstract void sound(); // Abstract method for making a sound
}

// Subclass Lion
class Lion extends Animal {
    @Override
    void sound() {
        System.out.println("The lion roars");
    }
}

// Subclass Tiger
class Tiger extends Animal {
    @Override
    void sound() {
        System.out.println("The tiger growls");
    }
}

// Main class to test the implementation
 class inheritance15 {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();

        lion.sound(); // Output: The lion roars
        tiger.sound(); // Output: The tiger growls
    }
}
