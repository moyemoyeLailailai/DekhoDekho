public class LA2_4_2 {
    public static void main(String[] args) {
        System.out.println("Kaushik Jain 22BCP357");
        StringBuilder str = new StringBuilder("Hello");
        updateStringBuilder(str);
        System.out.println("Value of StringBuilder: " + str);
    }

    public static void updateStringBuilder(StringBuilder s) {
        s.append(" World");
    }
}
