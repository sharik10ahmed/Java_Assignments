package Day_7.Exercise;
import java.util.*;
public class Q8power {
    public static double power(double x,double n){
        return Math.pow(x,n);

    }
    public static void main(String[] args){
        double x,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number-> ");
        x = sc.nextDouble();
        System.out.print("Enter power value-> ");
        n = sc.nextDouble();
        System.out.println(power(x,n));
    }
}
