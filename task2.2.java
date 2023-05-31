import java.util.*;
import  java.lang.*;
class Main {
    public static void main(String[] args) {
        Scanner cin= new Scanner(System.in);
        System.out.println("Enter any number : ");
        Float num= cin.nextFloat();
        if(num==0)
        {
             System.out.println("Zero");
        }
        else if (num>0)
        {
             System.out.println("positive");
            if(num<1)
            {
            System.out.println("Small positive");
            }
            else if(num>1000000)
            {
                 System.out.println("large positive");
            }
            
        }
        else if (num<0)
        {
             System.out.println("Negative");
            if(Math.abs(num)<1)
            {
            System.out.println("Small positive");
            }
            else if(Math.abs(num)>1000000)
            {
                 System.out.println("large positive");
            }
            
        }
    }
}