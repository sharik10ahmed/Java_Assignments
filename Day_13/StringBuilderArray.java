package Day_13;
import java.util.*;
public class StringBuilderArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size-> ");
        int size = sc.nextInt();

        StringBuilder[] arr = new StringBuilder[size];
        int totlength = 0;

        System.out.println("Enter Strings to count characters total: ");
        for(int i=0;i<size;i++){
            arr[i] = new StringBuilder(sc.next());

            totlength += arr[i].length();
        }
        System.out.print("Total Characters-> "+totlength);
    }
}