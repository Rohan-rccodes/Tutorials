import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class pro17 extends Applet implements ActionListener {
    /*
    Topic = DELEGATION EVENT MODEL
    prog.no 17 Java Program to Change the Applet Background Colour when Button Clicked
*/    Button b1;
    Color[] c = { Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW };
    int bgcolor = 0;

    @Override
    public void init() {
        b1 = new Button("Change Color");
        b1.addActionListener(this);
        add(b1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (bgcolor < c.length - 1) {
            bgcolor++;
        } else {
            bgcolor = 0;
        }
        setBackground(c[bgcolor]);
    }

}
//<applet code= pro17 width= 600 height=500 ></applet>