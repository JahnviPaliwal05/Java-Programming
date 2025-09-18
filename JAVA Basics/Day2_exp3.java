// Write a Java programme to perform product of two floating numbers using Scanner class
import java.util.*;
public class Day2_exp3{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    float a = scan.nextFloat();
    float b = scan.nextFloat();
    float c = a * b;
    System.out.println("Product of "+a+" and "+b+" is "+c);
  }
}  