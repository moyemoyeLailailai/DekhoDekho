import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class MouseEv implements MouseMotionListener
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
		fr.setSize(200,200);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.addMouseMotionListener(this);
	}
	
	
	public void mouseDragged(MouseEvent me)
	{
		int x=me.getX();
		int y=me.getY();
		l.setText("Dragged at["+x+"]["+y+"]");
	}
	
	public void mouseMoved(MouseEvent me)
	{
		int x=me.getX();
		int y=me.getY();
		l.setText("Moved at["+x+"]["+y+"]");
	}

	public MouseEv()
	{
	initGUI();
	}
	
	public static void main(String args[])
	{
	MouseEv m=new MouseEv();
	}
}