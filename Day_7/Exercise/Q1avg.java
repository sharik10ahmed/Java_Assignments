package Day_7.Exercise;
import java.util.*;
public class Q1avg {
    public static float avg(float sub1,float sub2,float sub3){
        return (sub1+sub2+sub3)/3;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float s1,s2,s3;
        System.out.printf("%n-----AVERAGE-----%n%n");
        System.out.print("Enter First subject-> ");
        s1=sc.nextInt();
        System.out.print("Enter Second subject-> ");
        s2=sc.nextInt();
        System.out.print("Enter Third subject-> ");
        s3=sc.nextInt();

        float result = avg(s1,s2,s3);
        System.out.printf("%nAverage of your 3 Subjects are-> %.2f%n",result);

    }
}
