package Day_7.Exercise;
import java.util.*;

public class Q10Fibonacci {
    public static void series(int n){
        int i,t1=0,t2=1,nextterm;

        System.out.printf("%n-----Fibonacci Series-----%n%n");

        for(i=1;i<=n;i++){
            if(i==1){
                System.out.printf("%d ",t1);
            }
            if(i==2){
                System.out.printf("%d ",t2);
            }
            nextterm=t1+t2;

            System.out.printf("%d ",nextterm);

            t1=t2;
            t2=nextterm;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("%nEnter number of terms-> ");
        int n = sc.nextInt();
        series(n);
    }
}

