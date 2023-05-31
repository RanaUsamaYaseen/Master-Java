import java.util.*;
import  java.lang.*;
class Main {
    public static void main(String[] args) {
        Scanner cin= new Scanner(System.in);
        System.out.println("Enter any number1 : ");
        Float num= cin.nextFloat();
         System.out.println("Enter any number2 : ");
        Float num1= cin.nextFloat();
        if (Math.abs(num-num1)<0.001)
        {
             System.out.println("Equals");
            
        }
        else
        {
            System.out.println("Not Equals");
        }
    }
}