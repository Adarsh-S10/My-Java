//2. WAP TO CHECK WHETHER THE PERSON IS ELIGIBLE TO MARRY OR NOT.

package PROGRAMS;
import java.util.*;
public class marry1 {
 
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age");
        int age=sc.nextInt();
        if(age >18)
        {
            System.out.println("eligible for marraige" );
        }
        else if(age==18)
        {
            System.out.println("eligible for marraige" );
        }
        else {
            System.out.println("not elidible for marraige");
        }
    }
}
    

