import java.awt.*;
import javax.swing.*;
class pro2
{
    
	public static void main(String args[])
	{
		//Create a frame
		Frame frame=new Frame("Login");
        TextField name= new TextField();
	    JPasswordField pswd; 
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setBackground(Color.white);
		//Create two labels
		Label l_name=new Label("Name :");
		Label l_pswd=new Label("Password :");
		l_name.setBounds(50,50,50,50);
		l_pswd.setBounds(20,100,80,50);
		frame.add(l_name);
		frame.add(l_pswd);
		//Create two text fields for name and password
		name=new TextField();
		pswd=new JPasswordField();
		name.setBounds(100,50,250,50);
		pswd.setBounds(100,100,250,50);
		frame.add(name);
		frame.add(pswd);
		
		frame.setVisible(true);
	}
}