//1.	WAP TO CHECK WHETHER NUMBER IS POSITIVE OR NOT


package PROGRAMS;
import java.util.*;

public class positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. :");
        int num = sc.nextInt();
        if(num>0)
        {
            System.out.println("number is positive");
        }else{
            System.out.println("number is negative");
            
        }
    }
}
