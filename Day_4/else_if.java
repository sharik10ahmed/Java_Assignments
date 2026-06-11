package Day_4;

import java.util.*;

public class else_if{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value for number 1 -> ");
        int a  = sc.nextInt();
        System.out.print("Enter a value for number 2 -> ");
        int b = sc.nextInt();

        if (a==b)
            System.out.printf("Both Numbers are Equal %d=%d",a,b);

        else if (a < b)
            System.out.printf("%d is greater than %d", b, a);

        else
                System.out.printf("%d is greater than %d",a,b);

        }
    }
