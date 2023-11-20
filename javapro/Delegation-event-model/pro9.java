import java.awt.*;
import java.awt.event.*;

class pro9 extends Frame implements ActionListener {
    Frame frame1, frame2;
    Button switchButton1, switchButton2;

    pro9() {
        frame1 = new Frame("Frame 1");
        frame2 = new Frame("Frame 2");
        switchButton1 = new Button("Switch to Frame 2");
        switchButton2 = new Button("Switch to Frame 1");

        switchButton1.addActionListener(this);
        switchButton2.addActionListener(this);

        frame1.setSize(300, 200);
        frame2.setSize(300, 200);
        frame1.setLayout(new FlowLayout());
        frame2.setLayout(new FlowLayout());

        frame1.add(new Label("This is Frame 1"));
        frame2.add(new Label("This is Frame 2"));
        frame1.add(switchButton1);
        frame2.add(switchButton2);

        frame1.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                frame1.dispose();
                frame2.dispose();
            }
        });
        
        frame2.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                frame1.dispose();
                frame2.dispose();
            }
        });
        frame1.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == switchButton1) {
            frame1.setVisible(false);
            frame2.setVisible(true);
        } else if (ae.getSource() == switchButton2) {
            frame2.setVisible(false);
            frame1.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new pro9();
    }
}