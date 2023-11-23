//Write a program in Java in which a subclass constructor invokes the constructor of the super class and instantiate the values.
public class Subclass_Constructor {
    public static void main(String[] args) {
        System.out.println("Kaushik jain 22BCP357");

        Derived ob1 = new Derived(1, "Kaushik jain");
        ob1.display();
    }
}
class Base{
    int emp_id;
    String name;
    public Base(int emp_id,String name ) {
        this.emp_id=emp_id;
        this.name=name;
    }
}

class Derived extends Base{
    public Derived(int emp_id, String name) {
        super(emp_id, name);
    }
    public void display(){
        System.out.println("EmployeeId: "+this.emp_id + " Name: "+ this.name);
    }
}