package Day_7;
import java.util.*;
public class prime_func {
    public static void prime_check(int n){
        int target=1;
        if(n==0 || n==1){
            System.out.println("Invalid Input");
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                target=0;
                break;
            }
        }
        if(target!=1){
            System.out.println("Not prime");
        }
        else {
            System.out.println("prime");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value-> ");
        int n = sc.nextInt();
        prime_check(n);
    }
}
