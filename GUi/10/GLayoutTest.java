import java.awt.*;
import javax.swing.*;

public class GLayoutTest
{
	JFrame myFrame;
	JButton b1,b2,b3,b4,b5;

	public void initGUI()
	{
		myFrame=new JFrame();
		Container c=myFrame.getContentPane();
		c.setLayout(new GridLayout(2,3,30,10));
		b1=new JButton("B1");
		b2=new JButton("B2");
		b3=new JButton("B3");
		b4=new JButton("B4");
		b5=new JButton("B5");
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		c.add(b5);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(150,200);
		myFrame.setVisible(true);
	}
	


	public GLayoutTest()
	{
	initGUI();
	}
	

	public static void main(String args[])
	{
	GLayoutTest g1=new GLayoutTest();
	}
}