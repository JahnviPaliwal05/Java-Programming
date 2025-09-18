// Write a Java programme to cheque whether the given number is Armstrong or not
import java.util.Scanner;
public class Day4_exp3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int original = num;
        int sum = 0;
        scan.close();
        int digits = String.valueOf(num).length();
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}

