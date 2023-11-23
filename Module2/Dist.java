import java.util.Scanner;
public class Dist{


public int f,i;

public void getdetails(){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the Distance in feet and inch");
f= sc.nextInt();
i=sc.nextInt();
}

public void display(){
System.out.println("The Distance is:" +f+"feet"+i+"inch");
 }

public void adder(Dist x){
Dist d3 = new Dist();
d3.f= f+x.f;
d3.i= i+x.i;
if(d3.i>=12){
d3.f++;
d3.i=d3.i-12;
 }
d3.display();
 }
}
