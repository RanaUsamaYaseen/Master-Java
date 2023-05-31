import java.util.Scanner;

public class AppendAndAdjustStrings {
    
    public static String appendAndAdjust(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        if (len1 > len2) {
            str1 = str1.substring(len1 - len2);
        } else if (len2 > len1) {
            str2 = str2.substring(len2 - len1);
        }

        return str1.concat(str2);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        
        scanner.close();
        
        String result = appendAndAdjust(str1, str2);
        
        System.out.println("Result: " + result);
    }
}
