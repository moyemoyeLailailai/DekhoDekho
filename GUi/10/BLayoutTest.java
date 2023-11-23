//Border Layout
import java.awt.*;
import javax.swing.*;

public class BLayoutTest
{
	JFrame myFrame;
	JButton b1,b2,b3,b4,b5,b6;

	public void initGUI()
	{
		myFrame=new JFrame();
		Container c=myFrame.getContentPane();
		c.setLayout(new BorderLayout());
		b1=new JButton("B1");
		b2=new JButton("B2");
		b3=new JButton("B3");
		b4=new JButton("B4");
		b5=new JButton("B5");
		b6=new JButton("B6");
		c.add(b1,BorderLayout.NORTH);
		c.add(b2,BorderLayout.SOUTH);
		c.add(b3,BorderLayout.CENTER);
		c.add(b4,BorderLayout.EAST);
		c.add(b5,BorderLayout.WEST);
		c.add(b6,BorderLayout.WEST);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(150,200);
		myFrame.setVisible(true);
	}
	


	//public BLayoutTest()
	//{
	//initGUI();
	//}
	

	public static void main(String args[])
	{
	BLayoutTest g1=new BLayoutTest();
	g1.initGUI();
	}
}