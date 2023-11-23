import javax.swing.*;
import java.awt.Color;
class Hi extends Thread
{

public void run()
{

try
{
for(int i=1;i<=10;i++)
{
System.out.println(8*i);
Thread.sleep(1000);
}
}
catch(Exception e)
{
System.out.println("Exception");
}
}
}

class Hello extends Thread
{
public void run()
{ 
try{
for(int i=1;i<=10;i++)
{
System.out.println(7*i);
Thread.sleep(1000);
}
}
catch(Exception e)
{
System.out.println("Exception");
}
}
}
public class Test_Counting2
{
public static void main(String args[])
{
JFrame f=new JFrame();
f.setTitle("My Frame");
f.setSize(900,500);
f.getContentPane().setBackground(Color.green);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);
Hi o1=new Hi();
Hello o2=new Hello();

System.out.println(o1.getName());
o1.start();
try
{
Thread.sleep(10);
}
catch(Exception e)
{
System.out.println("Exception");
}
o2.start();
}
}