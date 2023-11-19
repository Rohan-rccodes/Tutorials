
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name); 
        
        this.breed = breed;
    }

    void makeSound() {
        super.makeSound(); 
        
        System.out.println("The dog barks.");
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }
}

 class demo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever");
        myDog.makeSound(); 
        
        System.out.println();
        myDog.displayInfo();
    }
}