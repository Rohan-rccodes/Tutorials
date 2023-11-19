import java.awt.*;
import java.awt.event.*;
class awtpro1
{
    awtpro1()
    {
        Frame f= new Frame("checkbox Group");
        Label l1= new Label("which is your favourite programming language?");
        CheckboxGroup cg= new CheckboxGroup();
        Checkbox c1= new Checkbox("HTML",cg, false);
        Checkbox c2= new Checkbox("C",cg, false);
        Checkbox c3= new Checkbox("C++",cg, false);
        Checkbox c4= new Checkbox("JAVA",cg, false);
        f.setSize(700,400);
        f.setLayout( new FlowLayout());
        f.setVisible(true);
        f.add(l1);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(c4);
        f.addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                System.exit(1);    
            }    
       });
      }
    public static void main(String st[])
    {
        new awtpro1();
    }
    
}