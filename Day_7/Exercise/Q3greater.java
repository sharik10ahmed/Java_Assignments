package Day_7.Exercise;
import java.util.*;
public class Q3greater {
    public static void big(int a,int b){
        if(a>b) System.out.printf("%n%d is greater than %d%n%n",a,b);
        else System.out.printf("%n%d is greater than %d%n%n",b,a);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.printf("%n%n-----Greater FUNCTION-----%n%n");
        System.out.print("Enter First Value-> ");
        a=sc.nextInt();
        System.out.print("Enter Second Value-> ");
        b=sc.nextInt();

        big(a,b);

    }
}
