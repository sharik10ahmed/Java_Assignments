package Day_7.Exercise;
import java.util.*;
public class Q4radius2 {
    public static double radius(double r){
        return (2*Math.PI*r);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter circle radius-> ");
        double r = sc.nextDouble();
        double result = radius(r);
        System.out.printf("%nYour Circle's Circumference is %.2f%n%n",result);
    }
}
