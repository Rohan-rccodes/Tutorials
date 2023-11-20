// Declare the Animal interface
interface Animal {
    // Declare the abstract method "bark" that classes implementing this interface must provide
    void speak();
}

// Declare the Dog class, which implements the Animal interface
class Dog implements Animal {
    // Implement the "bark" method required by the Animal interface
    @Override
    public void speak() {
        // Print a message indicating that the Dog is barking
        System.out.println("Dog is barking!");
    }
}
public class interface_2_7093  {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog dog = new Dog();
        
        // Call the "bark" method on the Dog instance
        dog.speak();
    }
}
    