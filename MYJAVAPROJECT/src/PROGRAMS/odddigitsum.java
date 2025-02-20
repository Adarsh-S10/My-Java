//22.	WAP TO CALCULATE SUM OF ODD DIGITS IN A NUMBER.

package PROGRAMS;
import java.util.*;

public class odddigitsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int num = sc.nextInt();
        int count =0,digit =0,sum=0; 
        while(num>0){
            digit = num%10;
            if (digit %2!=0){
                System.out.println(digit +"" );
                sum=sum+digit;
                count++;
            }  num/=10;
    }
    System.out.println("sum of odd digit are:"+sum);
    if (count==0){
        System.out.println("odd no. not found");
    }else{
        System.out.println("total no. of odd digit is :"+count);
    }
    }


    
}
