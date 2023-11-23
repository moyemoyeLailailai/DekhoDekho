import java.io.*;
import java.util.*;
public class DuplicateDelete{
public static void main(String args[]){
try{
Scanner sc = new Scanner(new File("XYZ1.txt"));
FileWriter fw = new FileWriter("XYZ2.txt");
PrintWriter pw = new PrintWriter(fw);
Set <String> s = new HashSet<>();
while(sc.hasNextLine()){
String input = sc.nextLine();
if(s.add(input)){
pw.println(input);
}
}
fw.flush();
}
catch(IOException e){
System.out.println("File error");
}
finally{
System.out.println("Name: Kaushik Jain Roll Number: 22BCP357");
}
}
}