package Day_7.Exercise;
import java.util.*;
public class Q5vote {
    public static void vote(int age){
        if(age>=18) System.out.println("Eligible to vote");
        else System.out.println("not eligible to vote");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age-> ");
        int age = sc.nextInt();

        vote(age);
    }
}
