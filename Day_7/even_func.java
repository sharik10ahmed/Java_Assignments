package Day_7;

import java.util.*;

public class even_func {
    public static void even(int n){
        if(n==0 || n==1){
            System.out.println("Invalid Input");
        }
            if(n%2==0) System.out.println("even");

            else System.out.println("odd");

    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value-> ");
        int n = sc.nextInt();
        even(n);
    }
}
