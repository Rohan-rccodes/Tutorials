import java.awt.*;

public class pro1 {
  public static void main(String[] args) {
    Frame frame = new Frame("Text in Frame");

    Label label = new Label("This is some text!");

    frame.add(label);

    frame.setSize(400, 400);

    frame.setVisible(true);
  }
}