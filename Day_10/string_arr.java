package Day_10;
import java.util.*;
public class string_arr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many name you want to Save-> ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter your name-> ");
            arr[i] = sc.nextLine();
        }
        for(String items : arr) System.out.println(items);

    }
}
