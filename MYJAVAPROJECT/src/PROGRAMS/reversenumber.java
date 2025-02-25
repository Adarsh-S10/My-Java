//28.	WAP TO REVERSE THE NUMBER.->IN CLASS

package PROGRAMS;
import java.util.*;
public class reversenumber {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter a number :");
int num = sc.nextInt();
int reversed =0;

    while (num>0){
    int digit = num%10;
    reversed=reversed*10+digit;
    num/=10;
 }
 System.out.println("reversed number is :"+reversed);

    }
    
}
