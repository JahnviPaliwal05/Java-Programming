// Write a Java programme to cheque whether the given year is leap or not
import java.util.Scanner;
public class Day3_exp5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scan.nextInt();
        scan.close();
        if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
