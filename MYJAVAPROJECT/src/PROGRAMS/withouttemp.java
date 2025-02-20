package PROGRAMS;
import java.util.*;

public class withouttemp {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first value ");
        int a = sc.nextInt();
        System.out.println("enter the second value");
        int b =sc.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("after swapping a is " +a);
        System.out.println("after swapping b is " +b);


    }
    
}
