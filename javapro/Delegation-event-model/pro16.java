/*Java Program to Display Text with Background Color as Cyan*/
import java.awt.*;
class pro16
{
     public static void main(String args[])
    {
    Frame frame = new Frame("Cyan Text");
	frame.setSize(400,400);
	frame.setLayout(new FlowLayout());
	frame.setBackground(Color.CYAN);
	String str="The Background of Frame is Cyan";
	Label text = new Label(str);
	text.setFont(new Font("Serif",Font.ITALIC,20));
	frame.add(text);
	text.setForeground(Color.red);
	//Display the frame
	frame.setVisible(true);
    }
}