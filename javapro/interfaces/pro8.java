
interface Playable {
    void play();
}
class Football implements Playable {
  public void play() {
    System.out.println("Playing football");
  }
}


class Volleyball implements Playable {
    public void play() {
        System.out.println("Playing volleyball");
    }
}
class Basketball implements Playable {
    public void play() {
    System.out.println("Playing basketball");
    }
} 
class Main {
    public static void main(String[] args) {
        Playable football = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();

        football.play();
        volleyball.play();
        basketball.play();
    }
}