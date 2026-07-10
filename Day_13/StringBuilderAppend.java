package Day_13;
import java.util.*;
public class StringBuilderAppend {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many strings you will type-> ");
        int size = sc.nextInt();

        StringBuilder count = new StringBuilder();

        System.out.println("Enter Strings to count characters total: ");
        for(int i=0;i<size;i++){
            count.append(sc.next());
        }
        System.out.println("Total Characters-> "+count.length());
        sc.close();
    }
}
