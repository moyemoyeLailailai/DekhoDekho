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
public class Test_Counting_Join
{
	public static void main(String args[])
	{
	Hi o1=new Hi();
	Hello o2=new Hello();
	Hi o3=new Hi();

	o1.start();
	try
	{
		o1.join();
	}
	catch(Exception e)
	{
		System.out.println("Exception");
	}
	o2.start();
	
	try
	{
		Thread.sleep(10);
	}
	catch(Exception e)
	{
		System.out.println("Exception");
	}	

	o3.start();
	}
}