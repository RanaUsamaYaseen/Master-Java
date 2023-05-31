
import java.util.Scanner;

class Area {
    private int length;
    private int breadth;
    public void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int getArea() {
        return length * breadth;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Area rectangle = new Area();

        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = scanner.nextInt();

        rectangle.setDim(length, breadth);
        int area = rectangle.getArea();
        System.out.println("The area of the rectangle is: " + area);
    }
}

      