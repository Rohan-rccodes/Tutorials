import java.awt.*;
import java.awt.event.*;

class a{
    public static void main(String[] x) 
    {
        // Create a new frame.
        Frame f = new Frame("AWT Button custom Layout ");

        // Set the size of the frame.
        f.setSize(300, 300);

       
        // Create a button and add it to the frame.
        Button b1= new Button("Click me!");
        
        // Set the layout manager for the frame tocustom layout.
        b1.setBounds(150,100,60,60);
        f.add(b1);

        // Create a label and add it to the frame.
        Label l1 = new Label("Please click the button.");
        f.add(l1);

      
        // Display the frame.
        f.setVisible(true);
         // Handle the window closing event.
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}