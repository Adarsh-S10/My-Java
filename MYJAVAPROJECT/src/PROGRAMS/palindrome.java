//29.	WAP TO CHECK WHETHER THE NUMBER IS PALINDROME OR NOT.->IN CLASS

package PROGRAMS;
import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int originalNum = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;  // Extract last digit
            reversed = reversed * 10 + digit;  // Append digit to reversed number
            num /= 10;  // Remove last digit
        }

        // Check if the original number and reversed number are the same
        if (originalNum == reversed) {
            System.out.println(originalNum + " is a Palindrome.");
        } else {
            System.out.println(originalNum + " is NOT a Palindrome.");
        }
    }
}