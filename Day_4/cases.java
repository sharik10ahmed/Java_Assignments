package Day_4;

import java.util.*;

public class cases{
    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your choice-> ");
        int choice = sc.nextInt();

        switch(choice){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default:
                System.out.println("Invaild Input! ");
        }
    }
}