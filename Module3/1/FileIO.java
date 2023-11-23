import java.io.*;
public class FileIO{
public static void main(String[] args){
FileReader fr = null;
BufferedReader br = null;
FileWriter fw = null;
PrintWriter pw = null;
try{
fr = new FileReader("ABC.txt");
br = new BufferedReader(fr);
fw = new FileWriter("XYZ.txt");
pw = new PrintWriter(fw);
String s = br.readLine();
while(s!=null){
String s1 = s.toUpperCase();
pw.println(s1);
s = br.readLine();
}
fr.close();
br.close();
fw.close();
pw.close();
}
catch(IOException e){
System.out.println("File Error " +e);
}
}
}