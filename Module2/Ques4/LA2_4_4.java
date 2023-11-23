class Rectangle {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculateArea() {
        return length * width;
    }
}

public class LA2_4_4 {
    public static void main(String[] args) {
        System.out.println("Kaushik Jain 22BCP357");
        Rectangle rect = createRectangle(5, 3);
        int area = rect.calculateArea();
        System.out.println("Area of Rectangle: " + area);
    }

    public static Rectangle createRectangle(int length, int width) {
        return new Rectangle(length, width);
    }
}
