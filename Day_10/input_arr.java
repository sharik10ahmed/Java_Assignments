package Day_10;
import java.util.*;
public class input_arr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size-> ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.printf("Enter a value at index %d -> ",i);
            arr[i] = sc.nextInt();
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.printf("Value at index %d -> %d%n",i,arr[i]);
        }
        sc.close();
    }
}
