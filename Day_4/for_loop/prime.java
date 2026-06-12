package Day_4.for_loop;

import java.util.*;

import static java.lang.System.exit;

public class prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n-> ");
        int n = sc.nextInt();

        if(n==1 || n==0){
            System.out.println("Invaild");
            exit(0);
        }

        int target = 1;

        for(int i=2;i<n;i++){
            if(n%i==0){
                target=0;
                break;
            }
        }

        if(target==1){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        sc.close();
    }
}