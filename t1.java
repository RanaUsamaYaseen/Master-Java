import java.util.Scanner;

public class GetCharacterAtIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the index: ");
        int index = scanner.nextInt();

        char character = getCharacterAtIndex(inputString, index);

        if (character != '\0') {
            System.out.println("Character at index " + index + " is: " + character);
        } else {
            System.out.println("Invalid index");
        }

        scanner.close();
    }

    public static char getCharacterAtIndex(String str, int index) {
        if (index >= 0 && index < str.length()) {
            return str.charAt(index);
        } else {
            return '\0';
        }
    }
}
