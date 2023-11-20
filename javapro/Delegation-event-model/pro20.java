import java.awt.*;    
import java.awt.event.*;    
public class pro20 extends KeyAdapter {    
    Label l;    
    TextArea area;    
    Frame f;    
    pro20() {    
         f = new Frame ("Key Adapter");    
        l = new Label("Enter email: ");    
        l.setBounds (20, 50, 200, 20);    
        area = new TextArea();  
        area.setBounds (20, 80, 300, 300);    
        area.addKeyListener(this);    
         f.add(l);  
         f.add(area);    
        f.setSize (400, 400);    
        f.setLayout (null);    
        f.setVisible (true);    
    }    

    public void keyReleased (KeyEvent e) {    

        int k= e.getKeyCode();

            if (k == '@') {
               area.setEditable(true);
               
            } else {
               area.setEditable(false);
     
            }
    }    
  
    public static void main(String[] args) {    
        new pro20();    
    }    
}    