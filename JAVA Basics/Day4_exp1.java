// Write to Java programme to find reverse of a number
import java.util.Scanner;
public class Day4_exp1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number: " + rev);
    }
}
