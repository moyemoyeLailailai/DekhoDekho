package package1;

import package2.Child; // Import the Child class from package2

public class Test {
    public static void main(String[] args) {
         System.out.println("Kaushik Jain 22BCP357");
        Parent parent1 = new Parent();
        parent1.display(); // Calls display() from Parent class in package1

        Child child1 = new Child();
        child1.display(); // Calls display() from Child class in package1

        package2.Child child2 = new package2.Child();
        child2.display(); // Calls display() from Child class in package2
    }
}
