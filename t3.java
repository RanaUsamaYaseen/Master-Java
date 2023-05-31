import java.util.Scanner;

public class NumberOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        if (number1 < number2 && number2 < number3) {
            System.out.println("Increasing");
        } else if (number1 > number2 && number2 > number3) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither increasing nor decreasing order");
        }

        scanner.close();
    }
}
