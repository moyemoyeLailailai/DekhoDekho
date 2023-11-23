import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class EventEx
{
	JFrame f;
	JLabel l;
	public void initGUI()
	{
		f=new JFrame();
		l=new JLabel();
		Container c=f.getContentPane();
		c.setLayout(new BorderLayout());
		c.add(l,BorderLayout.NORTH);
		MouseHandle m=new MouseHandle();
		WindowHandle w=new WindowHandle();
		f.addMouseMotionListener(m);
		f.addWindowListener(w);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300,350);
		f.setVisible(true); 
	}
	private class WindowHandle extends WindowAdapter
	{
		public void windowClosing(WindowEvent we)
		{
		JOptionPane.showMessageDialog(null,"GOOD BYE");
		System.exit(0);
		}
	}
	private class MouseHandle extends MouseMotionAdapter
	{
		public void mouseMoved(MouseEvent me)
		{
		int x;
		int y;
		x=me.getX();
		y=me.getY();
		l.setText("Moved At["+x+"],["+y+"]");
		}
	}

	public EventEx()
	{
		initGUI();
	}

	public static void main(String args[])
	{
	EventEx e=new EventEx();
	}
}