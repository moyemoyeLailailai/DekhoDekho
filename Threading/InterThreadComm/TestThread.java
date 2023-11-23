class Chat { 
   boolean flag = false; 

   public synchronized void Question(String msg) 
   { 
   if (flag) { 
            	try { 
               		wait(); 
         	    }   
			catch (InterruptedException e)
		      { 
            		System.out.println(e);
       		      } 
      	     } 
      System.out.println(msg); 
      flag = true; 
      notify(); 
   } 

   public synchronized void Answer(String msg) { 
      if (!flag) { 
        		 try 
			{ 
            			wait(); 
         		}
			catch (InterruptedException e) 
			{ 
            			e.printStackTrace(); 
         		} 
      		} 
      System.out.println(msg); 
      flag = false; 
      notify(); 
   } 
} 




class T1 implements Runnable
  { 
   Chat m; 
   String[] s1 = { "Hi", "How are you ?", "I am also doing fine!" }; 
   public T1(Chat m1) 
   { 
      this.m = m1; 
      Thread t=new Thread(this);
      t.start(); 
   } 
   public void run() { 
	try{
      for (int i = 0; i < s1.length; i++)
      { 
	m.Question(s1[i]); 
	Thread.sleep(2000);
	}}
	catch(Exception e)
	{
	System.out.println("Exception:"+e);
	}
	
      } 
   } 






class T2 implements Runnable { 
   Chat m; 
   String[] s2 = { "Hi", "I am good, what about you?", "Great!" }; 
   public T2(Chat m2) { 
      this.m = m2; 
      Thread t=new Thread(this);
      t.start(); 
   } 
   public void run() { 
	try{
      for (int i = 0; i < s2.length; i++) { 
         m.Answer(s2[i]); 
	Thread.sleep(2000);
       
	}}
	catch(Exception e)
	{
	System.out.println(e);
	}
	
   } 
}



public class TestThread { 
   public static void main(String[] args) 
{ 
      Chat m = new Chat(); 
      T1 a=new T1(m); 
      T2 b=new T2(m); 
} 
}