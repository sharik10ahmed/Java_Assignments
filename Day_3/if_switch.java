package Day_3;

import java.util.*;
public class if_switch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your choice-> ");
        int choice = sc.nextInt();

        // Menu
        System.out.printf("Menu %n----Greeting---- %n1.English %n2.Hindi%n3.French%n%n");

        if(choice == 1){
            System.out.println("HELLO");
        }
        else if(choice == 2){
            System.out.println("Namaste");
        }
        else if(choice == 3)
            System.out.println("Bonjour");
        else
            System.out.println("Invalid input (Choose from menu)");

        sc.close();
    }
}