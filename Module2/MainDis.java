public class MainDis {
    public static void main(String[] args) {
      System.out.println("Kaushik Jain 22BCP357");
      Distance ob1= new Distance();
      ob1.converter(48);
    }


}
 class Distance{
     public Distance() {}
     public void converter(float value){
         float feet=0;
         float inch =0;

         feet=value/12;
         value=value%12;
         if(value<12){
             inch=value;
         }
         System.out.println("Feet: "+feet);
         System.out.println("Inch: "+inch);
     }
 }