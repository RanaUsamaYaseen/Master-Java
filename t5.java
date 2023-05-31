import java.util.Scanner;

public class CheckAdjacentCharacter {
    
    public static boolean checkAdjacentCharacter(String str, char ch) {
        int index = str.indexOf(ch);
        if (index != -1 && index < str.length() - 1 && str.charAt(index) == str.charAt(index + 1)) {
            return true;
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        scanner.close();
        
        boolean result = checkAdjacentCharacter(str, ch);
        
        if (result) {
            System.out.println(" followed by the same character.");
        } else {
            System.out.println("not  followed by the same character.");
        }
    }
}
