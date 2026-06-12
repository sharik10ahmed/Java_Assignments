package Day_3;

import java.util.*;

public class calc{
    public static void main(String[] args){
        int result;
        Scanner sc = new Scanner(System.in);

        System.out.printf("-----CALCULATOR PROGRAM-----%n%n%n");

        System.out.print("Enter First Value -> ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Value -> ");
        int num2 = sc.nextInt();

        System.out.printf("%n%n-----Menu-----%n%n");
        System.out.println("1.IF-ELSE");
        System.out.println("2.SWITCH");

        System.out.print("Enter method-> ");
        int switch_choice = sc.nextInt();

        System.out.printf("%n%n-----SUBMenu-----%n%n");
        System.out.println("1.Add");
        System.out.println("2.Sub");
        System.out.println("3.Division");
        System.out.println("4.Multiplication");
        System.out.printf("5.Modulo%n");

        System.out.print("Enter your choice-> ");
        int choice = sc.nextInt();
        if(switch_choice== 1) {
            if (choice == 1) {
                result = num1 + num2;
                System.out.printf("Addition-> %d", result);
            } else if (choice == 2) {
                result = num1 - num2;
                System.out.printf("Subtraction-> %d", result);
            } else if (choice == 3) {
                result = num1 / num2;
                System.out.printf("Division-> %d", result);
            } else if (choice == 4) {
                result = num1 * num2;
                System.out.printf("Product-> %d", result);
            } else if (choice == 5) {
                result = num1 % num2;
                System.out.printf("Remainder-> %d", result);
            } else {
                System.out.println("INVALID INPUT");
            }
        }
        else if(switch_choice==2){
            switch(choice){
                case 1:
                    System.out.printf("Addition-> %d", num1+num2);
                    break;
                case 2:
                    System.out.printf("Subtraction-> %d", num1-num2);
                    break;
                case 3:
                    System.out.printf("Division-> %d", num1/num2);
                    break;
                case 4:
                    System.out.printf("Product-> %d", num1*num2);
                    break;
                case 5:
                    System.out.printf("Remainder-> %d", num1%num2);
                    break;
                default:
                    System.out.println("INVALID INPUT");

            }
        }
        else{
            System.out.println("INVALID INPUT");
        }

    }
}