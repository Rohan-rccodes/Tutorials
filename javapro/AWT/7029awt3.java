import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

class AWTButtonExample {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Button Example");

       
        Button northButton = new Button("North");
        Button eastButton = new Button("East");
        Button westButton = new Button("West");
        Button southButton = new Button("South");
        Button centerButton = new Button("Center");

       
        frame.add(northButton, BorderLayout.NORTH);
        frame.add(eastButton, BorderLayout.EAST);
        frame.add(westButton, BorderLayout.WEST);
        frame.add(southButton, BorderLayout.SOUTH);
        frame.add(centerButton, BorderLayout.CENTER);

        
        frame.setSize(400, 300);
        frame.setVisible(true);

       
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}
