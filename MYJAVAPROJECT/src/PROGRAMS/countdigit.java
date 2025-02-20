//25.	WAP TO COUNT HOW MANY DIGITS ARE PRESENT IN A NUMBER.->IN CLASS

package PROGRAMS;
import java.util.*;

public class countdigit {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your no.");
        int num = sc.nextInt(); 
        if (num==0){
            count =1;
        }
    while(num>0){
        num/=10;
        count++;
    }
System.out.println("total digit are :" +count );    
}
    
}
