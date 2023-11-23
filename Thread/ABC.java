class ABC implements Runnable
{
	public void run()
	{
	try{
	System.out.println(Thread.currentThread().getName());
	for(int i=1;i<5;i++)
	{
	System.out.println(i);
	Thread.sleep(1000);
	}
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
	}
	
	public static void main(String args[])
	{
	ABC o1=new ABC();
	Thread t=new Thread(o1,"Arpit");
	t.start();
	}
}