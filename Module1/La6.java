import java.lang.*;
import java.util.Scanner;

public class La6 {
    static void area(int a,int b,int c){
        int s= (a+b+c)/2;
         int area= (int) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of triangle is "+ area);

    }
    static void area(int a){
        int area= a*a;
        System.out.println("Area of the sqaure is "+ area);
    }
    
    static void area(int a,int b){
        int area = a*b;
        System.out.println("Area of rectangle is "+ area);
    }

    public static void main(String[] args) {
        System.out.println("Samarth Detroja 22BCP184");
        int a,b,c;
        Scanner sc = new Scanner(System.in); 
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        area(a);
        area(a,b);
        area(a,b,c);
        
    }
}
