 import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ActionEventTest1 implements ActionListener
{
	JFrame myFrame;
	JButton bHello;
	JTextField tf;
	JTextArea a;
	JLabel l1;
	
	public void initGUI()
	{
		myFrame=new JFrame();
		bHello=new JButton("HELLO");
		tf=new JTextField(30);
		l1=new JLabel();
		l1.setBounds(500,600,20,300);
		a=new JTextArea();
		a.setBounds(500,600,20,300);
		bHello.setPreferredSize(new Dimension(80,60));	
		Container c=myFrame.getContentPane();
		c.add(tf);
		c.add(bHello);
		c.add(l1);
		
		c.setLayout(new FlowLayout());
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(200,200);
		myFrame.setVisible(true);
		
		bHello.addActionListener(this);
	}

	public ActionEventTest1()
	{
	initGUI();
	}
	

	public void actionPerformed(ActionEvent ae)
	{
	String s=tf.getText();
	//l1.setText(s);
	a.setText(s);
	JOptionPane.showMessageDialog(null,"HELLO"+s);
	}

	public static void main(String args[])
	{
	ActionEventTest1 e=new ActionEventTest1();
	}
}		