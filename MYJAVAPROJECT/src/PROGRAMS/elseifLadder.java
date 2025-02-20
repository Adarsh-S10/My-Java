package PROGRAMS;
import java.util.*;

public class elseifLadder
{
    public static void main(String[] args)
     {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your no.");
        int num = sc.nextInt();
        
        if(num>0)
        {
            System.out.println("No. is positive ");
            
            if(num%2==0)
        {
            System.out.println("no. is Even");
        }
         else
        {
            System.out.println("no. is Odd");
        }
        }
        else if(num<0)
        {
            System.out.println("No. is negetive ");
        }
        else
        {
            System.out.println("no. is Zero");
        }
    }
    
}
