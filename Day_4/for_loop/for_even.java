package Day_4.for_loop;

import java.util.*;

public class for_even {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n-> ");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            if(i!=0){
                if(i%2==0){
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}