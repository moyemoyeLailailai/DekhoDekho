import java.util.Scanner;

public class Percentage{
    public static void main(String[] args) {
        System.out.println("Samarth Detroja 22BCP184");

        int a,b,c,d,e,f;
        System.out.println("Enter 6 Subject Marks ");
        Scanner k= new Scanner(System.in);
        a= k.nextInt();
        b= k.nextInt();
        c= k.nextInt();
        d= k.nextInt();
        e= k.nextInt();
        f= k.nextInt();

        System.out.println("Your result is: "+(a+b+c+d+e+f)/6+"%");
    }
}
