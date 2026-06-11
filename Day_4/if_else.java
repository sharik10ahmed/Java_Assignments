package Day_4;

import java.util.*;

public class if_else{
    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age-> ");
        int age = sc.nextInt();

        if (age >=18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Minor");
        }

    }
}