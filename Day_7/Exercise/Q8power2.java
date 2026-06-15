package Day_7.Exercise;
import java.util.*;
public class Q8power2 {
    public static int power(int x, int n){
        int expo=1;
        for(int i=1;i<=n;i++){
            expo*=x;
        }
        return expo;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a base number-> ");
        int x = sc.nextInt();
        System.out.print("Enter power value-> ");
        int n = sc.nextInt();
        System.out.println(power(x,n));
    }
}