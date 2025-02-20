//18.	WAP TO PRINT EVEN DIGITS IN A NUMBER.

package PROGRAMS;
import java.util.*;

public class evendigit {
    public static void main(String[] args) {
        boolean found= false;
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int num = sc.nextInt();

        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                System.out.print(digit + " ");
                found = true;
                count++;
            }
            num /= 10;
           
        }
        if (count == 0) {
            System.out.print("No even digits found.");
        } else {
            System.out.println("\nTotal number of even digits: " + count);
        }
       if (!found) {
            System.out.print("No even digits found.");
        }
        System.out.println();
    }
    }
    

