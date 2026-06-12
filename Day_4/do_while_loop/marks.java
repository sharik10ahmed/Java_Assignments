package Day_4.do_while_loop;

import java.util.*;

public class marks{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        do{
            System.out.printf("%nEnter value-> ");
            int i = sc.nextInt();
            if(i==0) break;
            System.out.print("Enter marks-> ");
            int marks = sc.nextInt();

            if(marks>=90){
                System.out.print("A+");
            }
            else if(89>=marks && marks>=60){
                System.out.print("A");
            }
            else if(59>=marks && marks>=20){     // 65 >=
                System.out.print("B+");
            }
            else{
                System.out.print("F");
            }
        }while(true);

        sc.close();

        System.out.printf("%nProgram Exited%n");

    }
}