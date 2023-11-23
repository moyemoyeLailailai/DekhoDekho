import java.awt.*;
import javax.swing.*;

public class GUICalc
{
	public GUICalc()
	{
	init();
	}
	

	public void init()
	{
	JButton b1=new JButton("1");
	JButton b2=new JButton("2");
	JButton b3=new JButton("3");
	JButton b4=new JButton("4");
	JButton b5=new JButton("5");
	JButton b6=new JButton("6");
	JButton b7=new JButton("7");
	JButton b8=new JButton("8");
	JButton b9=new JButton("9");
	JButton b0=new JButton("0");
	

	JButton bPlus=new JButton("+");
	JButton bMinus=new JButton("-");
	JButton bMul=new JButton("*");
	JButton bDiv=new JButton("/");
	JButton bPoint=new JButton(".");
	JButton bClear=new JButton("C");

	JFrame myFrame=new JFrame();
	JPanel but=new JPanel(new GridLayout(4,4));
	

	but.add(b1);
	but.add(b2);
	but.add(b3);
	but.add(bClear);
	
	but.add(b4);
	but.add(b5);
	but.add(b6);
	but.add(bPlus);
	
	but.add(b7);
	but.add(b8);
	but.add(b9);
	but.add(bMinus);

	but.add(b0);
	but.add(bPoint);
	but.add(bDiv);
	but.add(bMul);
	JLabel lb=new JLabel("MY CALCULATOR");
	//JLabel lb2=new JLabel("Your CALCULATOR");
	JTextField tf=new JTextField(15);

	Container c=myFrame.getContentPane();	
	c.setLayout(new BorderLayout());
	

	c.add(tf,BorderLayout.NORTH);
	c.add(lb,BorderLayout.SOUTH);
	//c.add(lb2,BorderLayout.SOUTH);
	c.add(but,BorderLayout.CENTER);

	myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	myFrame.setSize(300,300);
	myFrame.setVisible(true);
	}
}
	
	
	
	