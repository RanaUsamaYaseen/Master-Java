import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner cin= new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num= cin.nextInt();
        if(num>0)
        {
             System.out.println("Positive");
        }
        else
        {
            System.out.println("Negative");
        }
    }
}