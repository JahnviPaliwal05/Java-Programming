import java.util.*;
public class Day2_exp5{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number a:");
    int a = scan.nextInt();
    System.out.println("Enter number b:");
    int b = scan.nextInt();
    a= a+b;
    b = a-b;
    a = a-b;
    System.out.println("Value of number a after swapping:");
    System.out.println(a);
    System.out.println("Value of number b after swapping:");
    System.out.println(b);
  }
}  