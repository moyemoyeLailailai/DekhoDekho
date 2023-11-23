import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort {
    public static void main(String[] args) {
        System.out.println("Smit Patel 22BCP367");
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        n=sc.nextInt();
        System.out.println("Enter the elements of the Array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        
        }
        Bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
 static void Bubblesort(int[] arr){
        boolean swapped;
     for (int i = 0; i <= arr.length-1; i++) {
         swapped = false;
         for (int j = 1; j <= arr.length-i-1; j++) {
                if(arr[j-1]>arr[j]){
                 int temp = arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1]=temp;
                   swapped = true;
               }


         }
        if(swapped== false) {
          break;
          // if you did not swap for a particular value then the array is sorted so we can break the functio

      }
     }
   }
 }