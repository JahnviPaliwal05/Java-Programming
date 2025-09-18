// Write a Java programme to swap two numbers using 3rd variable
import java.util.*;
public class Day2_exp4{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number a:");
    int a = scan.nextInt();
    System.out.println("Enter number b:");
    int b = scan.nextInt();
    int c = a;
    a = b;
    b = c;
    System.out.println("Value of number a after swapping:");
    System.out.println(a);
    System.out.println("Value of number b after swapping:");
    System.out.println(b);
  }
}  