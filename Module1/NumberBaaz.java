import java.util.Scanner;

public class NumberBaaz {
    public static void main(String[] args) {
        System.out.println("Samarth Detroja 22BCP184");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a Line");
        String m = sc.nextLine();
        String k = m.toLowerCase();
        int V_count=0,S_count=0;
        for (int i = 0; i < k.length(); i++) {
            if (k.charAt(i) == 'a' || k.charAt(i) == 'e' || k.charAt(i) == 'i' || k.charAt(i) == 'o' || k.charAt(i) == 'u') {
                V_count=V_count+1;
            }
        }
        for(int j=0;j < k.length();j++){
         if(k.charAt(j) == ' '){
           S_count++;
         }
        }
        int C_count = k.length() - S_count-V_count;
        System.out.println("The number of Vowels are:"+V_count);
        System.out.println("The Number of consonants are:"+ C_count);
    }


}