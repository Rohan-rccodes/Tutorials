
class Animal {
    public void move() {
        System.out.println("The animal moves.");
    }
}

 class Cheetah extends Animal {
   @Override
    public void move() {
        System.out.println("The Cheetah runs.");
    }
}

class  Main_c{
    public static void main(String x[] ) {
        Animal a = new Animal();
        Cheetah c = new Cheetah();        
        a.move();
        c.move();
    }
}