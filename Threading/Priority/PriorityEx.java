public class PriorityEx{
public static void main (String args[ ])
{ 

//instantiate two objects 
Worker first = new Worker ("first job");
Worker second = new Worker ("second job"); 
//create two objects 
Thread t1 = new Thread (first ); 
Thread t2 = new Thread (second); 


//Threads to execute 
//set thread priorities 
//t1.setPriority (Thread.MIN_PRIORITY);
//t2.setPriority (Thread.MAX_PRIORITY); 
t1.setPriority (3);
t2.setPriority (5); 
//start t
t1.start();
//t1.sleep(200);
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
}
t2.start();
 


}//end main
} // end class 