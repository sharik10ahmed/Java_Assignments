package Day_7;

import java.util.*;

public class fact{
  public static void Factorial(int n){
    if(n<0){
      System.out.println("Invalid number");
    }
    int factorial=1;

    for(int i=n;i>=1;i--){
      factorial=factorial*i;
    }

    System.out.println(factorial);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a value-> ");
    int n = sc.nextInt();

    Factorial(n);
  }
}