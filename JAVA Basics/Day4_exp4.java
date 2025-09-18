// Write a Java programme to find square root of a number using Math class
import java.util.Scanner;
public class Day4_exp4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scan.nextDouble();
        scan.close();
        double sqrt = Math.sqrt(num);
        System.out.println("Square root of " + num + " is: " + sqrt);
    }
}

