package Day_7;

import java.util.*;

public class table_func {
    public static void table(int n){

        for(int i = 1; i<=n*10; i++){
            if(i%n==0){
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value-> ");
        int n = sc.nextInt();
        table(n);
    }
}
