package Day_7.Exercise;
import java.util.*;
public class Q9gcd {
    public static int gcd(int a,int b){
        int temp;
        while(b!=0){
            temp=b;

            b = a%b;

            a = temp;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a First value-> ");
        int a = sc.nextInt();
        System.out.print("Enter Second Value-> ");
        int b = sc.nextInt();
        System.out.printf("The GCD of %d and %d is %d",a,b,gcd(a,b));
    }
}
