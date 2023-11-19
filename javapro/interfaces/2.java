interface Animal {
    void bark();
}



class Dog implements Animal {
    
    
    public void bark() {
        System.out.println("DOG IS BARKING");
    }
}


class demo {
    public static void main(String[] args) {
        
        
        Dog dog = new Dog();
        dog.bark();
    }
}
