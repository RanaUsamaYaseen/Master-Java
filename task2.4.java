import java.util.*;
import  java.lang.*;
class Main {
    public static void main(String[] args) {
        Scanner cin= new Scanner(System.in);
        System.out.print("Enter a single character from the alphabet: ");
        String input = cin.nextLine();

        if (input.length() != 1) {
            System.out.println("Error: Invalid input! Please enter a single character.");
        } else {
            char ch = input.charAt(0);
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch); 
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Consonant");
                }
            } else {
                System.out.println("Error: Invalid input! Please enter a letter from the alphabet.");
            }
        }


    }
}