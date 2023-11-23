import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class MouseEv1 implements MouseMotionListener,WindowListener
{
	JLabel l;
	JFrame fr;
	
	public void initGUI()
	{
		fr=new JFrame();
		l=new JLabel();
		Container c=fr.getContentPane();
		c.setLayout(new BorderLayout());
		c.add(l,BorderLayout.NORTH);
		fr.setSize(512,512);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.addMouseMotionListener(this);
		fr.addWindowListener(this);
	}
	
	
	public void mouseDragged(MouseEvent me)
	{
		int x=me.getX();
		int y=me.getY();
		l.setText("Dragged at["+x+"]["+y+"]");
	}
	
	public void windowActivated(WindowEvent we)
	{
	
	}

	public void windowClosed(WindowEvent we)
	{
	JOptionPane.showMessageDialog(null,"Happy Diwali Pratham");
	}


	public void windowClosing(WindowEvent we)
	{
	//JOptionPane.showMessageDialog(null,"GoodBye");
	}


	public void windowDeactivated(WindowEvent we)
	{
	//JOptionPane.showMessageDialog(null,"Window is Deactivated");
	}
	public void windowDeiconified(WindowEvent we)
	{
	JOptionPane.showMessageDialog(null,"Window is Maximized");
	}
	public void windowIconified(WindowEvent we)
	{
	JOptionPane.showMessageDialog(null,"Window is Minimized");
	}
	public void windowOpened(WindowEvent we)
	{
	JOptionPane.showMessageDialog(null,"Welcome to Java");
	}
	public void mouseMoved(MouseEvent me)
	{
		int x=me.getX();
		int y=me.getY();
		l.setText("Moved at["+x+"]["+y+"]");
	}

	public MouseEv1()
	{
	initGUI();
	}
	
	public static void main(String args[])
	{
	MouseEv1 m=new MouseEv1();
	}
}