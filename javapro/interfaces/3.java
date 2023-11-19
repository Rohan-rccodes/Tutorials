// Flyable interface
interface Flyable {
    void fly_obj();
}

// Spacecraft class implementing Flyable interface
class Spacecraft implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Spacecraft is flying in space.");
    }
}

// Airplane class implementing Flyable interface
class Airplane implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Airplane is flying in the sky.");
    }
}

// Helicopter class implementing Flyable interface
class Helicopter implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Helicopter is flying in the air.");
    }
}

class fly{
    public static void main(String[] args) {
        // Create objects of each class and call fly_obj() method
        Spacecraft sc = new Spacecraft();
        Airplane ap = new Airplane();
        Helicopter hc = new Helicopter();

        // Call fly_obj() method for each object
        sc.fly_obj();
        ap.fly_obj();
        hc.fly_obj();
    }
}
