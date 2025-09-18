// Write Java programme to generate the Fabona Ki sequence up to given number of terms
import java.util.Scanner;
public class Day3_exp4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scan.nextInt();
        
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}

