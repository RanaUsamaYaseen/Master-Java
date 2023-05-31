import java.util.Scanner;

public class SwapLastTwoCharacters {

    public static String swapLastTwo(String str) {
        if (str.length() < 2) {
            System.out.println("String length must be two or more.");
            return str;
        }

        char[] charArray = str.toCharArray();
        int lastIndex = charArray.length - 1;

        char temp = charArray[lastIndex];
        charArray[lastIndex] = charArray[lastIndex - 1];
        charArray[lastIndex - 1] = temp;

        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String swappedString = swapLastTwo(input);
        System.out.println("Swapped String: " + swappedString);
    }
}
