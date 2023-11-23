import java.io.*;
import java.util.*;
public class ArrayIndexOut{
public static void main(String args[]){
try{
int arr[] = {1, 2, 3, 4, 5};
int start = 0;
int end = 6;
int mid;
System.out.println("Enter the element to be searched from the array: ");
Scanner sc = new Scanner(System.in);
int item = sc.nextInt();
while(start<=end){
mid = (start+end)/2;
if(arr[mid] == item){
System.out.println(mid);
System.exit(1);
}
else if(arr[mid]<item)
start = mid+1;
else
end = mid-1;
}
if(start>end)
System.out.println("Element is not in the array");
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("Array Index Out of Bounds");
}
finally{
System.out.println("Name:Kaushik Jain Roll no: 22BCP357");
		}
	}
} 
