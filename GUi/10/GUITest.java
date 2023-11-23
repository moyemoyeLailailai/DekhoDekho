import java.awt.*;
import javax.swing.*;

public class GUITest
{
	JFrame myFrame;
	JTextField tf;
	JButton b1;

	public void initGUI()
	{
		myFrame=new JFrame();
		Container c=myFrame.getContentPane();
		c.setLayout(new FlowLayout());
		tf=new JTextField(15);
		b1=new JButton("MyButton");
		c.add(tf);
		c.add(b1);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(150,200);
		myFrame.setVisible(true);
	}
	


	public GUITest()
	{
	initGUI();
	}
	

	public static void main(String args[])
	{
	GUITest g1=new GUITest();
	}
}