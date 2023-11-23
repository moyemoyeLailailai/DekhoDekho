class Hi extends Thread
{

public void run()
{
try
{
for(int i=1;i<=5;i++)
{
System.out.println("Hi");
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
for(int i=1;i<=5;i++)
{
System.out.println("Hello");
Thread.sleep(1000);
}
}
catch(Exception e)
{
System.out.println("Exception");
}
}
}
public class Test2
{
public static void main(String args[])
{
Hi o1=new Hi();
Hello o2=new Hello();

System.out.println(o1.getName());
System.out.println(o2.getName());
o1.setName("Hi Thread");
o2.setName("Hello Thread");


System.out.println(o1.getName());
System.out.println(o2.getName());


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