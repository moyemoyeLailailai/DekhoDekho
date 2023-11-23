 import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ActionEventTest implements ActionListener
{
	JFrame myFrame;
	JButton bHello;
	JTextField tf;
	
	public void initGUI()
	{
		myFrame=new JFrame();
		bHello=new JButton("HELLO");
		tf=new JTextField(30);
		bHello.setPreferredSize(new Dimension(80,60));	
		Container c=myFrame.getContentPane();
		c.add(tf);
		c.add(bHello);
		c.setLayout(new FlowLayout());
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(200,200);
		myFrame.setVisible(true);
		
		bHello.addActionListener(this);
	}

	public ActionEventTest()
	{
	initGUI();
	}
	

	public void actionPerformed(ActionEvent ae)
	{
	String s=tf.getText();
	JOptionPane.showMessageDialog(null,"HELLO:"+s);
	}

	public static void main(String args[])
	{
	ActionEventTest e=new ActionEventTest();
	}
}		