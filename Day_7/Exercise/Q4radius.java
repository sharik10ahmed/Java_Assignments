package Day_7.Exercise;
import java.util.*;
public class Q4radius {
    public static float radius(float r){
        float pie= 3.14F;
        return (2*pie*r);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter circle radius-> ");
        float r = sc.nextFloat();
        float result = radius(r);
        System.out.printf("%nYour Circle's Circumference is %.2f%n%n",result);
    }
}
