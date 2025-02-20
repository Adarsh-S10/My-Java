//4.WAP TO DISPLAY MESSAGE GOOD MORNING WHEN NUMBER IS 8 AND NUMBER EQUALS TO 10 AND NUMBER EQUALS TO 11

package PROGRAMS;
import java.util.*;

public class message {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no.");
        int num = sc.nextInt();

        if(num == 8 || num == 10 || num == 11)
        {
            System.out.println("GOODMORNING");
        }
        else
        {
            System.out.println("invalid no.");
        }
    }
}