import java.awt.*;
import java.awt.event.*;

class pro6 extends Frame implements MouseListener{
Button b1,b2;

pro6(){
b1= new Button("ok");
b2= new Button("cancel");
setLayout(new FlowLayout());
add(b1); add(b2);

b1.addMouseListener(this);

b2.addMouseListener(this);
setSize(500,400);
setVisible(true);
}

public static void main(String s[]){
new pro6();
}

public  void mouseClicked(java.awt.event.MouseEvent me){System.out.println("button clicked");}
public  void mousePressed(java.awt.event.MouseEvent me){System.out.println("button pressed");}
public  void mouseReleased(java.awt.event.MouseEvent me){System.out.println("button released");}
public  void mouseEntered(java.awt.event.MouseEvent me){System.out.println("button eneterd");}
public  void mouseExited(java.awt.event.MouseEvent me){System.out.println("button exited");}
}