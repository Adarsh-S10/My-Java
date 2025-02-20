package PROGRAMS;
import java.util.*;

public class odddigit {
    public static void main(String[] args) {
        int count =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int num = sc.nextInt();
        int digit=0;
        while(num>0){
             digit = num % 10;
            if(digit % 2 != 0)
            { 
                System.out.println(digit +"");
                count++;   
            }
        num/=10;
       
        }
    if(count==0)
{
    System.out.println("odd no. not found ");
}else{
    System.out.println("total no. of odd digit are :"+count);
}
    
}
}
