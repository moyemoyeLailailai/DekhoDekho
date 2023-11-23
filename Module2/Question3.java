

public class Question3 {
    public static void main(String[] args) {
        System.out.println("Kaushik Jain 22BCP357");
        fun(1,2,3,4,5);
        fun();
        fun(1);
    }
    static void fun(int... a)
    {
        System.out.println("Number of arguments: " + a.length);
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
    }
}
