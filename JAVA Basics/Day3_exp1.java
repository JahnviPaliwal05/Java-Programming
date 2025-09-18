// Write a Java programme to make calculator
import java.util.*;
public class Day3_exp1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        int sign;
        System.out.println("Press 1 for addition\nPress 2 for subtraction\nEnter 3 for multiplication");
        System.out.println("Enter 4 for division\n\nEnter number:");
        sign = scan.nextInt();
        if(sign == 1){
            System.out.println("Enter value for num1:");
            num1 = scan.nextInt();
            System.out.println("Enter value for num2:");
            num2 = scan.nextInt();
            System.out.println(num1+" + "+num2+" = "+(num1+num2));
        }
        if(sign == 2){
            System.out.println("Enter value for num1:");
            num1 = scan.nextInt();
            System.out.println("Enter value for num2:");
            num2 = scan.nextInt();
            System.out.println(num1+" - "+num2+" = "+(num1-num2));
        }
        if(sign == 3){
            System.out.println("Enter value for num1:");
            num1 = scan.nextInt();
            System.out.println("Enter value for num2:");
            num2 = scan.nextInt();
            System.out.println(num1+" x "+num2+" = "+(num1*num2));
        }
        if(sign == 4){
            System.out.println("Enter value for num1:");
            num1 = scan.nextInt();
            System.out.println("Enter value for num2:");
            num2 = scan.nextInt();
            System.out.println(num1+" / "+num2+" = "+(num1/num2));
        }
        scan.close();
    
    }
}

