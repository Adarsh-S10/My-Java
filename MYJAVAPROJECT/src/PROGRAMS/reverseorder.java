//17.	WAP TO PRINT EACH DIGIT IN A NUMBER(IN REVERSE ORDER).->IN CLASS
package PROGRAMS;
import java.util.*;


public class reverseorder {
    public static void main(String[] args) {
        int remainder,reverse=0;
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the no.");
         int num = sc.nextInt();
while(num!=0){
remainder=num%10;
reverse=reverse*10+remainder;
num=num/10;
System.out.println(reverse);
}

}}
