package Day_7.Exercise;
import java.util.*;
public class Q2sum_odd {
    public static int odd(int n){
        int sum = 0;
        for(int i=0;i<=n;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a value-> ");
        int n = sc.nextInt();
        int result = odd(n);
        System.out.printf("%nSum of all odd numbers is %d%n%n",result);
    }
}
