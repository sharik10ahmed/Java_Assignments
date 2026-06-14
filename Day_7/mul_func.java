package Day_7;

import java.util.*;

public class mul_func{
    public static int product(int a,int b){
        return a*b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Value-> ");
        int a = sc.nextInt();
        System.out.print("Enter Second Value-> ");
        int b = sc.nextInt();
        System.out.println(product(a,b));
    }
}