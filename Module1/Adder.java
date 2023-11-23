import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        System.out.println("Samarth Detroja 22BCP184");
        int a,b;
        Scanner k= new Scanner(System.in);
        System.out.println("Enter the first Number");
        a= k.nextInt();
        System.out.println("Enter the second Number ");
        b= k.nextInt();
        System.out.println("Sum is: " +adder(a,b));
        System.out.println("Difference is: "+sub(a,b));
        System.out.println("Product is: "+mul(a,b));
        System.out.println("Quotient is: "+div(a,b));
    }

    static int adder(int n,int m){return n+m;}
    static int sub(int n,int m){return n-m;}
    static int mul(int n,int m){return n*m;}
    static int div(int n,int m){
        if(m==0){
            return -1;
        }
        return n/m;}

}