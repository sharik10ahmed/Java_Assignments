import java.util.*;
public class sum{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for a-> ");
        int a = sc.nextInt();
        System.out.print("Enter a value for b-> ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.printf("Sum of a and b-> %d", sum);

        sc.close();
    }
}